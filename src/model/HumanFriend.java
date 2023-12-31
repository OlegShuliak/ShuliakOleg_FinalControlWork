package model;

import constructor.AnimalKind;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class HumanFriend {
    protected Type type;
    protected AnimalKind kind;
    private String name;
    private String skill;
    private Date dateOfBirth;

    public HumanFriend(String name, String skill, Date dateOfBirth) {
        this.name = name;
        this.skill = skill;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public AnimalKind getKind() {
        return kind;
    }

    public void setKind(AnimalKind kind) {
        this.kind = kind;
    }




}
