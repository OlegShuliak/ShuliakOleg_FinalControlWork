package model;

import constructor.PackAnimalKind;

import java.util.Date;

public class Donkey extends HumanFriend {

    public Donkey(String name, String skill, Date dateOfBirth) {
        super(name, skill, dateOfBirth);
        super.type = Type.PACKANIMAL;
        super.kind = PackAnimalKind.DONKEY;
    }

    @Override
    public String toString() {
        return String.format("Животное: %s, %s. Кличка: %s. Навыки: %s. Дата рождения: %s. \n", "Вьючное животное", "Осел", getName(), getSkill(), getDateOfBirth());
    }
}
