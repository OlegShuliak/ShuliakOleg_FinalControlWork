package serviсe;

import model.Type;
import registry.Registry;

import java.io.*;
import java.util.*;


public class RegEditor {

    private Scanner scanner = new Scanner(System.in);

    public void writeAnimal(ArrayList animalInfoArr, Registry animalReg) {
        do {
            int animalID = idGen();
            try {
                if (!animalReg.getAnimalHashMap().containsKey(animalID)) {
                    animalReg.getAnimalHashMap().put(animalID, animalInfoArr);
                    break;
                }
            } catch (NullPointerException exception) {
                animalReg.getAnimalHashMap().putIfAbsent(animalID, animalInfoArr);
            }
        } while (true);
    }

    public ArrayList setAnimal(Registry animalReg) {
        System.out.println("Введите Id животного: ");
        do {
            try {
                int animalID = Integer.parseInt(scanner.nextLine());
                if (animalReg.getAnimalHashMap().containsKey(animalID)) {
                    ArrayList animalForTrain = animalReg.getAnimalHashMap().get(animalID);
                    return animalForTrain;
                }
                System.out.println("Животного с таким Id нет в реестре, повторите попытку ввода:");
            } catch (NumberFormatException exception) {
                System.out.println("Неверный формат ввода, повторите попытку.");
            }
        } while (true);
    }

    public void delAnimal(Registry animalReg) {
        System.out.println("Введите Id животного: ");
        do {
            try {
                int animalID = Integer.parseInt(scanner.nextLine());
                if (animalReg.getAnimalHashMap().containsKey(animalID)) {
                    animalReg.getAnimalHashMap().remove(animalID);
                    break;
                }
                System.out.println("Животного с таким Id нет в реестре, повторите попытку ввода:");
            } catch (NumberFormatException exception) {
                System.out.println("Неверный формат ввода, повторите попытку.");
            }
        } while (true);

    }

    private int idGen() {
        int id = new Random().nextInt(1000, 10000);
        return id;
    }

    public void showAnimalReg(Registry regAnimal) {
        int counter = 0;
        if (regAnimal.getAnimalHashMap().isEmpty()) {
            System.out.println("Животные отсутствуют в данном списке.");
        } else {
            for (var animal : regAnimal.getAnimalHashMap().entrySet()) {
                System.out.printf("ID = %d: %s", animal.getKey(), new AnimalEditor().animalFromArr(animal.getValue()));
            }
        }
    }

    public Type chooseType() {
        boolean f = true;
        System.out.println("Выберите тип животного: \n 1 - Вьючные животные; \n 2 - Домашние животные.");

        while (f) {
            try {
                int typeID = Integer.parseInt(scanner.nextLine());
                switch (typeID) {
                    case 1 -> {
                        f = false;
                        return Type.PACKANIMAL;
                    }
                    case 2 -> {
                        f = false;
                        return Type.PET;
                    }
                    default ->
                            System.out.println("Выбран несуществующий тип, повторите попытку ввода: \n 1 - Вьючные животные; \n 2 - Домашние животные.");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Неверный формат ввода данных, повторите попытку ввода: \n 1 - Вьючные животные; \n 2 - Домашние животные.");
            }

        }
        return null;
    }

    public void saveReg(Registry regAnimal, Type type) {
        try (FileWriter writer = new FileWriter("src/registry/" + type + ".txt", false)) {
            for (var animal : regAnimal.getAnimalHashMap().entrySet()) {
                writer.write(String.format("%s, %s\n", animal.getKey(), animal.getValue()).replace("[", "").replace("]", ""));
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Registry loadReg(Type type) {
        Registry regAnimal = new Registry(new HashMap<>());
        LoadAnimal loadAnimal = new LoadAnimal();
        AnimalEditor animalEditor = new AnimalEditor();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/registry/" + type + ".txt"));
            String str;
            while ((str = br.readLine()) != null) {
                ArrayList<String> list = new ArrayList<>(List.of(str.split(",")));
                System.out.println(list);
                regAnimal.getAnimalHashMap().put(Integer.parseInt(list.get(0)), animalEditor.animalInfArr(loadAnimal.strToAnimal(list.get(2).trim(), list.get(3).trim(), list.get(4).trim(), list.get(5).trim())));
            }
            br.close();
        } catch (FileNotFoundException exFile) {
            System.out.println("Отсутствует файл реестра.");
        } catch (IOException exIO) {
            System.out.println(exIO.getMessage());
        }
        return regAnimal;
    }
}
