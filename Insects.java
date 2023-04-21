public abstract class Insects extends Animal{
    public Insects(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "grass";
    }

    public abstract String color();
}
