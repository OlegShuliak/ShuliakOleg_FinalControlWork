package model;

import java.util.Date;

public class Dog extends HumanFriend {
    private Type type;

    public Dog(String name, String skill, Date dateOfBirth, Type type) {
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
        return String.format("Животное: %s, %s. Кличка: %s. Навыки: %s. Дата рождения: %s. \n", "Домашнее животное", "Собака", getName(), getSkill(), getDateOfBirth());
    }
}
