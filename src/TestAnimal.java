public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        Animal sheep = registry.createSheep();
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();
        
        ((Sheep) sheep).setName("Dolly");
        ((Cow) cow).setSound("Moo!");
        ((Horse) horse).setColor("Black");

        System.out.println(sheep.getType() + " named " + ((Sheep) sheep).getName());
        System.out.println(cow.getType() + " sounds " + ((Cow) cow).getSound());
        System.out.println(horse.getType() + " color is " + ((Horse) horse).getColor());

        Animal sheep2 = registry.createSheep();
        ((Sheep) sheep2).setName("Molly");

        System.out.println(sheep2.getType() + " named " + ((Sheep) sheep2).getName());

        Animal cow2 = registry.createCow();
        ((Cow) cow2).setFood("Grass");
        ((Cow) cow2).setSound("Maa!");
        System.out.println(cow2.getType() + " sounds " + ((Cow) cow2).getSound());
        System.out.println(cow2.getType() + " eats " + ((Cow) cow2).getFood());
        
        Animal horse2 = registry.createHorse();
        ((Horse) horse2).setColor("Brown");
        System.out.println(horse2.getType() + " is " + ((Horse) horse2).getColor());
    }
}
