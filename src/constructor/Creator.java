package constructor;

import model.HumanFriend;

import java.util.Date;

public interface Creator<T extends HumanFriend> {
    T createNewAnimal(AnimalKind kind, String name, String skill, Date dateOfBirth);
}
