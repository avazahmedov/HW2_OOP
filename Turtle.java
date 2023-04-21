public class Turtle extends Reptiles implements Walkable{
    public Turtle(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Iu-iu-iu";
    }

    @Override
    public int walkSpeed() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("%s, Says: %s",super.toString(), say());
    }
}
