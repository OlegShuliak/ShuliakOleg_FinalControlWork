package model;

import java.util.Date;

public class Hamster extends HumanFriend {

    private Type type;

    public Hamster(String name, String skill, Date dateOfBirth, Type type) {
        super(name, skill, dateOfBirth);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Животное: %s, %s. Кличка: %s. Навыки: %s. Дата рождения: %s. \n", "Домашнее животное", "Хомяк", getName(), getSkill(), getDateOfBirth());
    }
}
