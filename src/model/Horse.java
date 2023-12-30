package model;

import java.util.Date;

public class Horse extends HumanFriend {

    private Type type;

    public Horse(String name, String skill, Date dateOfBirth, Type type) {
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
        return "Horse{" +
                "type=" + type +
                '}';
    }
}
