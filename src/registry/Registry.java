package registry;

import java.util.List;

public class Registry {

    private List animalList;

    public Registry() {
    }

    public Registry(List animalList) {
        this.animalList = animalList;
    }

    public List getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List animalList) {
        this.animalList = animalList;
    }

    @Override
    public String toString() {
        return animalList.toString();
    }
}
