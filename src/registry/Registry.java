package registry;

import java.util.HashMap;
import java.util.List;

public class Registry {

    private HashMap animalHashMap;

    public Registry() {
    }

    public Registry(HashMap animalHashMap) {
        this.animalHashMap = animalHashMap;
    }

    public HashMap getAnimalHashMap() {
        return animalHashMap;
    }

    public void setAnimalHashMap(HashMap animalHashMap) {
        this.animalHashMap = animalHashMap;
    }

    @Override
    public String toString() {
        return "Registry{" +
                "animalHashMap=" + animalHashMap +
                '}';
    }
}
