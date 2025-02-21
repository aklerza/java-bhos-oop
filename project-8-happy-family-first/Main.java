public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("f-16", "Mikayil", 54, 11, new String[]{"eat", "drink", "sleep"});
        Human mother = new Human("Atakisi", "Atakisiyev", 1990);
        Human father = new Human("Atabala", "Atabalayev", 1970);
        Human child = new Human("Ramiz", "Ramizov", 2001, 50, pet, mother, father, null);

        System.out.println(child);
        child.greetPet();
        child.describePet();
        pet.eat();
        pet.respond();
        pet.foul();
    }
}