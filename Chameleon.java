public class Chameleon extends Reptiles implements Walkable{
    public Chameleon(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Ale-ale-ale";
    }

    @Override
    public int walkSpeed() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("%s, Says: %s", super.toString(), say());
    }
}
