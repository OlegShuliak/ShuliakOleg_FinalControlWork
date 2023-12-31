package constructor;

import exeptions.NonExistKind;
import model.*;

import java.util.Date;

public class AnimalConstructor implements Creator {

    @Override
    public HumanFriend createNewAnimal(Type type, AnimalKind kind, String name, String skill, Date dateOfBirth) {
        try {
            if (type == Type.PET & kind == PetKind.HUMSTER) {
                return new Hamster(name, skill, dateOfBirth, type);
            } else if (type == Type.PET & kind == PetKind.DOG) {
                return new Dog(name, skill, dateOfBirth, type);
            } else if (type == Type.PET & kind == PetKind.CAT) {
                return new Cat(name, skill, dateOfBirth, type);
            } else if (type == Type.PACKANIMAL & kind == PackAnimalKind.HORSE) {
                return new Horse(name, skill, dateOfBirth, type);
            } else if (type == Type.PACKANIMAL & kind == PackAnimalKind.DONKEY) {
                return new Donkey(name, skill, dateOfBirth, type);
            } else if (type == Type.PACKANIMAL & kind == PackAnimalKind.CAMEL) {
                return new Camel(name, skill, dateOfBirth, type);
            } else throw new NonExistKind(type, kind);
        } catch (NonExistKind nonExistKind){

        }
        return null;
    }
}
