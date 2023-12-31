package model;

import constructor.PetKind;

import java.util.Date;

public class Hamster extends HumanFriend {

    public Hamster(String name, String skill, Date dateOfBirth) {
        super(name, skill, dateOfBirth);
        super.type = Type.PET;
        super.kind = PetKind.HUMSTER;
    }

    @Override
    public String toString() {
        return String.format("Животное: %s, %s. Кличка: %s. Навыки: %s. Дата рождения: %s. \n", "Домашнее животное", "Хомяк", getName(), getSkill(), getDateOfBirth());
    }
}
