package serviсe;

import registry.Registry;

import java.util.ArrayList;
import java.util.Random;


public class RegEditor {
    public void writeAnimal(ArrayList animalInfoArr, Registry animalReg){
        do {
            int animalID = idGen();
            if (!animalReg.getAnimalHashMap().containsKey(animalID)) {
                animalReg.getAnimalHashMap().put(animalID, animalInfoArr);
                break;
            }
        } while (true);
    }

    public void delAnimal (int animalID, Registry animalReg){
        do {
            if (animalReg.getAnimalHashMap().containsKey(animalID)) {
                animalReg.getAnimalHashMap().remove(animalID);
                break;
            }
        } while (true);
    }

    private int idGen (){
        int id = new Random().nextInt(0,10000);
        return id;
    }
}
