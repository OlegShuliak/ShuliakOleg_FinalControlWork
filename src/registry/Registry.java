package registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Registry {

    private HashMap animalHashMap;

    public Registry() {
    }

    public Registry(HashMap animalHashMap) {
        this.animalHashMap = animalHashMap;
    }

    public HashMap <Integer, ArrayList> getAnimalHashMap() {
        return animalHashMap;
    }

    public void setAnimalHashMap(HashMap animalHashMap) {
        this.animalHashMap = animalHashMap;
    }


    @Override
    public String toString() {
        return animalHashMap.toString();
    }
}
