package model;


import constructor.PackAnimalKind;

import java.util.Date;

public class Camel extends HumanFriend {

    public Camel(String name, String skill, Date dateOfBirth) {
        super(name, skill, dateOfBirth);
        super.type = Type.PACKANIMAL;
        super.kind = PackAnimalKind.CAMEL;
    }

    @Override
    public String toString() {
        return String.format("Животное: %s, %s. Кличка: %s. Навыки: %s. Дата рождения: %s. \n", "Вьючное животное", "Хомяк", getName(), getSkill(), getDateOfBirth());
    }
}
