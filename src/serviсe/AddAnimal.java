package serviсe;

import constructor.AnimalConstructor;
import constructor.AnimalKind;
import constructor.PackAnimalKind;
import constructor.PetKind;
import model.HumanFriend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AddAnimal {

    private Scanner scanner = new Scanner(System.in);

    private AnimalKind kind;
    private String name;
    private String skill;
    private Date dateOfBirth;

    public HumanFriend newAnimal() {
        return new AnimalConstructor().createNewAnimal(setKind(), setName(), setSkill(), setDateOfBirth());
    }

    private AnimalKind setKind() {
        int kindNum = 0;
        do {
            try {
                System.out.printf("Выберите животное: \n 1 - Хомяк; \n 2 - Собака; \n 3 - Кот; \n 4 - Лошадь; \n 5 - Осел; \n 6 - Верблюд; \n");
                kindNum = Integer.parseInt(scanner.nextLine());
                if (kindNum == 1) {
                    return this.kind = PetKind.HUMSTER;
                } else if (kindNum == 2) {
                    return this.kind = PetKind.DOG;
                } else if (kindNum == 3) {
                    return this.kind = PetKind.CAT;
                } else if (kindNum == 4) {
                    return this.kind = PackAnimalKind.HORSE;
                } else if (kindNum == 5) {
                    return this.kind = PackAnimalKind.DONKEY;
                } else if (kindNum == 6) {
                    return this.kind = PackAnimalKind.CAMEL;
                } else System.out.printf("Такого животного нет в списке, попробуйте снова. \n");
            } catch (NumberFormatException exception) {
                System.out.printf("Неверный формат ввода, повторите попытку. \n");
            }
        } while (true);
    }

    private String setName() {
        System.out.printf("Введите кличку животного: ");
        return this.name = scanner.nextLine();
    }

    private String setSkill() {
        System.out.printf("Введите команды животного: ");
        return this.skill = scanner.nextLine();
    }

    private Date setDateOfBirth() {
        do {
            try {
                System.out.printf("Введите дату рождения животного: dd-MM-yyyy \n");
                String date = scanner.nextLine();
                return this.dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            } catch (ParseException parseException) {
                System.out.printf("Неверно введен формат даты, повторите попытку. \n");
            }
        } while (true);
    }

}
