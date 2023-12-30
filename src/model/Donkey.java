package model;

import java.util.Date;

public class Donkey extends HumanFriend {
    private Type type;

    public Donkey(String name, String skill, Date dateOfBirth, Type type) {
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
        return "Donkey{" +
                "type=" + type +
                '}';
    }
}
