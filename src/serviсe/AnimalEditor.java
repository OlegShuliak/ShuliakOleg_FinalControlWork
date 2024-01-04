package serviсe;

import constructor.AnimalConstructor;
import constructor.AnimalKind;
import model.HumanFriend;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AnimalEditor {

    private Scanner scanner = new Scanner(System.in);

    public ArrayList AnimalInfArr(HumanFriend humanFriend) {
        ArrayList animalInf = new ArrayList<>(5);
        animalInf.add(0, humanFriend.getType());
        animalInf.add(1, humanFriend.getKind());
        animalInf.add(2, humanFriend.getName());
        animalInf.add(3, humanFriend.getSkill());
        animalInf.add(4, humanFriend.getDateOfBirth());
        return animalInf;
    }

    public HumanFriend AnimalFromArr(ArrayList animalInfArr) {
        HumanFriend animal = new AnimalConstructor().createNewAnimal((AnimalKind) animalInfArr.get(1), (String) animalInfArr.get(2), (String) animalInfArr.get(3), (Date) animalInfArr.get(4));
        return animal;
    }

    public void AnimalTrain(ArrayList animalInfArr) {
        String animalSkill = (String) animalInfArr.get(3);
        StringBuilder sb = new StringBuilder(animalSkill);
        do {
            System.out.println("Введите новую команду для животного: ");
            String newSkill = scanner.nextLine();
            sb.append(", " + newSkill);
            break;
        } while (true);
        animalInfArr.set(3, sb.toString());
    }

    public void ViewSkill(ArrayList animalInfArr) {
        System.out.printf("Команды животного: %S. \n", animalInfArr.get(3));
    }
}
