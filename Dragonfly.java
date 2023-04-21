public class Dragonfly extends Insects implements Flyable{
    public Dragonfly(String name) {
        super(name);
    }

    @Override
    public int flySpeed() {
        return 85;
    }

    @Override
    public String color() {
        return "green";
    }

    @Override
    public String toString() {
        return String.format( "%s, Color: %s", super.toString(), color());
    }
}
