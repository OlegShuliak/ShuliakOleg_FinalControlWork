package model;

import constructor.PackAnimalKind;

import java.util.Date;

public class Horse extends HumanFriend {

    public Horse(String name, String skill, Date dateOfBirth) {
        super(name, skill, dateOfBirth);
        super.type = Type.PACKANIMAL;
        super.kind = PackAnimalKind.HORSE;
    }

    @Override
    public String toString() {
        return String.format("%s, %s. Кличка: %s. Навыки: %s. Дата рождения: %s. \n", "Вьючное животное", "Лошадь", getName(), getSkill(), df.format(getDateOfBirth()));
    }
}
