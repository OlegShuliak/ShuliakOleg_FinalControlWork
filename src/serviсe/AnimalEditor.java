package serviсe;

import constructor.AnimalConstructor;
import constructor.AnimalKind;
import model.HumanFriend;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AnimalEditor {

    private Scanner scanner = new Scanner(System.in);
    public ArrayList AnimalInfArr(int id, HumanFriend humanFriend) {
        ArrayList animalInf = new ArrayList();
        animalInf.set(0, id);
        animalInf.set(1, humanFriend.getType());
        animalInf.set(2, humanFriend.getKind());
        animalInf.set(3, humanFriend.getName());
        animalInf.set(4, humanFriend.getSkill());
        animalInf.set(5, humanFriend.getDateOfBirth());
        return animalInf;
    }

    public HumanFriend AnimalFromArr (ArrayList animalInfArr){
        HumanFriend animal = new AnimalConstructor().createNewAnimal((AnimalKind) animalInfArr.get(2), (String) animalInfArr.get(3), (String) animalInfArr.get(4), (Date) animalInfArr.get(5));
        return animal;
    }

    public ArrayList AnimalTrain (ArrayList animalInfArr){
        String animalSkill = (String) animalInfArr.get(4);
        StringBuilder sb = new StringBuilder(animalSkill);
        do {
            System.out.println("Введите новую команду для животного: ");
            String newSkill = scanner.nextLine();
            sb.append(", " + newSkill);
            System.out.println("Желаете добавить еще одну команду? \n 1. Да \n 2. Нет");
            int ans = Integer.parseInt(scanner.nextLine());
            if (ans == 2) { break; }
        } while (true);
        animalInfArr.set(4, sb.toString());
        return animalInfArr;
    }

    public void viewSkill (ArrayList animalInfArr){
        System.out.printf("Команды животного: %S. \n", animalInfArr.get(4));
    }
}
