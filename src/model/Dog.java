package model;

import java.util.Date;

public class Dog extends HumanFriend {
    private int id;
    private Type type;

    public Dog(String name, String skill, Date dateOfBirth, int id, Type type) {
        super(name, skill, dateOfBirth);
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", type=" + type +
                '}';
    }
}
