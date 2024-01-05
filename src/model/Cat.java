package model;

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
        return String.format("%s, %s. Кличка: %s. Навыки: %s. Дата рождения: %s. \n", "Домашнее животное", "Кот", getName(), getSkill(), df.format(getDateOfBirth()));
    }
}
