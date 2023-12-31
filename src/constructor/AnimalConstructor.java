package constructor;

import exeptions.NonExistKind;
import model.*;

import java.util.Date;

public class AnimalConstructor implements Creator {

    public HumanFriend createNewAnimal(AnimalKind kind, String name, String skill, Date dateOfBirth) {
        try {
            if (kind == PetKind.HUMSTER) {
                return new Hamster(name, skill, dateOfBirth);
            } else if (kind == PetKind.DOG) {
                return new Dog(name, skill, dateOfBirth);
            } else if (kind == PetKind.CAT) {
                return new Cat(name, skill, dateOfBirth);
            } else if (kind == PackAnimalKind.HORSE) {
                return new Horse(name, skill, dateOfBirth);
            } else if (kind == PackAnimalKind.DONKEY) {
                return new Donkey(name, skill, dateOfBirth);
            } else if (kind == PackAnimalKind.CAMEL) {
                return new Camel(name, skill, dateOfBirth);
            } else throw new NonExistKind(kind);
        } catch (NonExistKind nonExistKind){

        }
        return null;
    }
}
