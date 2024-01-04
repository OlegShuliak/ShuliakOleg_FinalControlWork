
import registry.Registry;
import serviсe.AddAnimal;
import serviсe.AnimalEditor;
import serviсe.RegEditor;

import java.util.HashMap;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;

        Registry animalBase = new Registry(new HashMap<>());
        RegEditor regEditor = new RegEditor();
        AnimalEditor animalEditor = new AnimalEditor();

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
                    case 1:
                        regEditor.writeAnimal(animalEditor.AnimalInfArr(new AddAnimal().newAnimal()), animalBase);
                        break;
                    case 2:
                        System.out.println(animalBase.toString());
                        break;
                    case 3:
                        regEditor.delAnimal(animalBase);
                        break;
                    case 4:
                        animalEditor.AnimalTrain(regEditor.setAnimal(animalBase));
                        break;
                    case 5:
                        animalEditor.ViewSkill(regEditor.setAnimal(animalBase));
                        break;
                    case 0:
                        f = false;
                        break;
                    default:
                        System.out.println("Такой операции не существует. Повторите попытку ввода.");
                        break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Неверный формат ввода, повторите попытку.");
            }
        }
    }
}

