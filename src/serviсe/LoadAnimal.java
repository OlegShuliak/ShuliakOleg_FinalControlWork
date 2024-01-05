package serviсe;

import constructor.AnimalConstructor;
import constructor.AnimalKind;
import constructor.PackAnimalKind;
import constructor.PetKind;
import model.HumanFriend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class LoadAnimal {

    private AnimalKind kind;
    private String name;
    private String skill;
    private Date dateOfBirth;
    public HumanFriend strToAnimal(String kind, String name, String skill, String  birth) {
        return new AnimalConstructor().createNewAnimal(setKind(kind), setName(name), setSkill(skill), setDateOfBirth(birth));
    }

    private AnimalKind setKind(String kind) {
        if (kind.equalsIgnoreCase("HUMSTER")) {
            return this.kind = PetKind.HUMSTER;
        } else if (kind.equalsIgnoreCase("DOG")) {
            return this.kind = PetKind.DOG;
        } else if (kind.equalsIgnoreCase("CAT")) {
            return this.kind = PetKind.CAT;
        } else if (kind.equalsIgnoreCase("HORSE")) {
            return this.kind = PackAnimalKind.HORSE;
        } else if (kind.equalsIgnoreCase("DONKEY")) {
            return this.kind = PackAnimalKind.DONKEY;
        } else if (kind.equalsIgnoreCase("CAMEL")) {
            return this.kind = PackAnimalKind.CAMEL;
        } else return null;
    }

    private String setName(String name) {
        return this.name = name;
    }

    private String setSkill(String skill) {
        return this.skill = skill;
    }

    private Date setDateOfBirth(String birth) {
        try {
            return this.dateOfBirth = new SimpleDateFormat("E MMM WW HH:mm:ss z yyyy", Locale.ENGLISH).parse(birth);
        } catch (ParseException parseException) {
            System.out.printf("Распарси дату, идиот! \n");
        }
        return null;
    }

}
