public class Butterfly extends Insects implements Flyable{
    public Butterfly(String name) {
        super(name);
    }

    @Override
    public int flySpeed() {
        return 65;
    }

    @Override
    public String color() {
        return "yellow";
    }

    @Override
    public String toString() {
        return String.format( "%s, Color: %s", super.toString(), color());
    }
}
