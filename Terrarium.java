import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    public List<Animal> getAnimalList() {
        return animalList;
    }
    private List<Animal> animalList = new ArrayList<>();

    public Terrarium addToAnimalList(Animal animal){
        animalList.add(animal);
        return this;
    }

    public List<Flyable> flyables(){
        List<Flyable> flyableList = new ArrayList<>();
        for (int i = 0; i < getAnimalList().size(); i++) {
            if(getAnimalList().get(i) instanceof Flyable)
                flyableList.add((Flyable) getAnimalList().get(i));
        }
        return flyableList;
    }

    public List<Walkable> walkables(){
        List<Walkable> walkableList = new ArrayList<>();
        for (int i = 0; i < getAnimalList().size(); i++) {
            if (getAnimalList().get(i) instanceof Walkable)
                walkableList.add((Walkable) getAnimalList().get(i));
        }
        return walkableList;
    }
}
