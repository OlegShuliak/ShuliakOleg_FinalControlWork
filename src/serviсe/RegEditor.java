package serviсe;

import model.HumanFriend;
import registry.Registry;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


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

    public void showAnimalReg(Registry regAnimal){
        int counter = 0;
        if (regAnimal.getAnimalHashMap().isEmpty()){
            System.out.println("Животные отсутствуют в данном списке.");
        } else {
            for (var animal : regAnimal.getAnimalHashMap().entrySet()) {
                System.out.printf("ID = %d: %s", animal.getKey(), new AnimalEditor().animalFromArr(animal.getValue()));
            }
        }

    }
}
