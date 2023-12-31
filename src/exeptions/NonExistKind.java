package exeptions;

import constructor.AnimalKind;
import model.Type;

public class NonExistKind extends Exception{
    public NonExistKind (Type type, AnimalKind kind){
        System.out.printf("Некорректный ввод данных, животное %s не является %s, повторите попытку ввода.", kind, type);
    }
}
