package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class HumanFriend {
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


}
