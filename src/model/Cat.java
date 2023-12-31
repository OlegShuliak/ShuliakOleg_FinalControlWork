package model;

import constructor.PackAnimalKind;
import constructor.PetKind;

import java.util.Date;

public class Cat extends HumanFriend {

    public Cat(String name, String skill, Date dateOfBirth) {
        super(name, skill, dateOfBirth);
        super.type = Type.PET;
        super.kind = PetKind.CAT;
    }

    @Override
    public String toString() {
        return String.format("Животное: %s, %s. Кличка: %s. Навыки: %s. Дата рождения: %s. \n", "Домашнее животное", "Кот", getName(), getSkill(), getDateOfBirth());
    }
}
