public class Main {
    public static void main(String[] args) {
        // Create pet objects
        Pet fish = new Fish();
        Pet dog = new Dog();
        Pet domesticCat = new DomesticCat();
        Pet roboCat = new RoboCat();

        // Create a family with father and mother
        Man father = new Man("Sirxan", "Abbasov", 120);
        Woman mother = new Woman("Nuri", "Serin", 110);
        Family family = new Family("Miki", father, mother);

        // Test pets' responses
        System.out.println("-------------------");
        System.out.println("Fish response:");
        fish.respond();

        System.out.println("-------------------");
        System.out.println("Dog response:");
        dog.respond();

        System.out.println("-------------------");
        System.out.println("Domestic Cat response:");
        domesticCat.respond();

        System.out.println("-------------------");
        System.out.println("Robo Cat response:");
        roboCat.respond();

        // Test foul behavior for pets that can foul
        System.out.println("-------------------");
        System.out.println("Testing foul behavior:");
        if (domesticCat instanceof Foulable) {
            ((Foulable) domesticCat).foul();
        }
        if (dog instanceof Foulable) {
            ((Foulable) dog).foul();
        }

        // Test human behavior
        System.out.println("-------------------");
        System.out.println("Father's greeting to pet:");
        father.greetPet();
        father.uniqueMethod(); // Unique method for men (repairCar)

        System.out.println("-------------------");
        System.out.println("Mother's greeting to pet:");
        mother.greetPet();
        mother.uniqueMethod(); // Unique method for women (makeup)

        // Test child creation from family
        System.out.println("-------------------");
        System.out.println("New child born:");
        Human child = family.bornChild();
        child.greetPet();
        child.uniqueMethod(); // Unique method for child based on gender
    }
}
