public abstract class Reptiles extends Animal{

    public Reptiles(String name){
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }

    public abstract String say();

}
