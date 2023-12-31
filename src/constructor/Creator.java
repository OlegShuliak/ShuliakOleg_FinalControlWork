package constructor;

import model.HumanFriend;
import model.Type;

import java.util.Date;

public interface Creator <T extends HumanFriend>{
    T createNewAnimal(Type type, AnimalKind kind, String name, String skill, Date dateOfBirth);
}
