
import model.HumanFriend;
import model.Type;
import registry.Registry;
import serviсe.AddAnimal;
import serviсe.AnimalEditor;
import serviсe.RegEditor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        RegEditor regEditor = new RegEditor();
        AnimalEditor animalEditor = new AnimalEditor();

        Registry petBase = regEditor.loadReg(Type.PET);
        Registry packAnimalBase = regEditor.loadReg(Type.PACKANIMAL);
//        Registry packAnimalBase = new Registry(new HashMap<>());
//        Registry petBase = new Registry(new HashMap<>());

        while (f) {
            System.out.println("Введите номер операции для работы со справочником:");
            System.out.println("1 - Добавить новое животное в реестр.");
            System.out.println("2 - Показать список всех животных.");
            System.out.println("3 - Удалить животное из реестра.");
            System.out.println("4 - Добавить умение животного.");
            System.out.println("5 - Показать список умений животного.");
            System.out.println("0 - Завершить работу с реестром.");

            try {
                int operation = Integer.parseInt(scanner.nextLine());

                switch (operation) {
                    case 1 -> {
                        HumanFriend animal = new AddAnimal().newAnimal();
                        if (animal.getType() == Type.PACKANIMAL) {
                            regEditor.writeAnimal(animalEditor.animalInfArr(animal), packAnimalBase);
                        } else {
                            regEditor.writeAnimal(animalEditor.animalInfArr(animal), petBase);
                        }
                    }
                    case 2 -> {
                        if (regEditor.chooseType() == Type.PACKANIMAL) {
                            regEditor.showAnimalReg(packAnimalBase);
                        } else {
                            regEditor.showAnimalReg(petBase);
                        }
                    }
                    case 3 -> {
                        if (regEditor.chooseType() == Type.PACKANIMAL) {
                            regEditor.delAnimal(packAnimalBase);
                        } else {
                            regEditor.delAnimal(petBase);
                        }
                    }
                    case 4 -> {
                        if (regEditor.chooseType() == Type.PACKANIMAL) {
                            animalEditor.animalTrain(regEditor.setAnimal(packAnimalBase));
                        } else {
                            animalEditor.animalTrain(regEditor.setAnimal(petBase));
                        }
                    }
                    case 5 -> {
                        if (regEditor.chooseType() == Type.PACKANIMAL) {
                            animalEditor.viewSkill(regEditor.setAnimal(packAnimalBase));
                        } else {
                            animalEditor.viewSkill(regEditor.setAnimal(petBase));
                        }
                    }
                    case 0 -> {
                        regEditor.saveReg(petBase, Type.PET);
                        regEditor.saveReg(packAnimalBase, Type.PACKANIMAL);
                        f = false;
                    }
                    default -> System.out.println("Такой операции не существует. Повторите попытку ввода.");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Неверный формат ввода, повторите попытку.");
            }

        }
    }
}

