public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addToAnimalList(new Turtle("Zuzu"))
                .addToAnimalList(new Chameleon("Jojo"))
                .addToAnimalList(new Butterfly("Lily"))
                .addToAnimalList(new Dragonfly("Jaka"));

        for (int i = 0; i < terrarium.getAnimalList().size(); i++) {
            System.out.println(terrarium.getAnimalList().get(i));
        }
        System.out.println("-----------------------");
        for (int i = 0; i < terrarium.walkables().size(); i++) {
            System.out.printf("%s, Speed: %d\n", terrarium.walkables().get(i).toString(), terrarium.walkables().get(i).walkSpeed());
        }
        System.out.println("-----------------------");
        for (int i = 0; i < terrarium.flyables().size(); i++) {
            System.out.printf("%s, Speed: %d\n", terrarium.flyables().get(i).toString(), terrarium.flyables().get(i).flySpeed());
        }

    }
}
