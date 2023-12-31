
import serviсe.AddAnimal;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;

        while (f) {
            System.out.println("Введите номер операции для работы со справочником:");
            System.out.println("1 - Добавить новое животное в реестр.");
            System.out.println("0 - Завершить работу с реестром.");

            try {
                int operation = Integer.parseInt(scanner.nextLine());

                switch (operation) {
                    case 1:
                        String msg = new AddAnimal().newAnimal().toString();
                        System.out.printf(msg);
                        break;
                    case 2:

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

