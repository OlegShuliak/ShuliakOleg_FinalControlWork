package model;

import constructor.PetKind;

import java.util.Date;

public class Dog extends HumanFriend {

    public Dog(String name, String skill, Date dateOfBirth) {
        super(name, skill, dateOfBirth);
        super.type = Type.PET;
        super.kind = PetKind.DOG;
    }

    @Override
    public String toString() {
        return String.format("Животное: %s, %s. Кличка: %s. Навыки: %s. Дата рождения: %s. \n", "Домашнее животное", "Собака", getName(), getSkill(), getDateOfBirth());
    }
}
