package exeptions;

import constructor.AnimalKind;
import model.Type;

public class NonExistKind extends Exception{
    public NonExistKind (AnimalKind kind){
        System.out.printf("Некорректный ввод данных, животного %s нет в базе.", kind);
    }
}
