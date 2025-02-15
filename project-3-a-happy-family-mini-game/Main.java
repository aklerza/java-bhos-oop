public class Main {
    public static void main(String[] args) {

        String[][] motherSchedule = {{"Monday", "Work"}, {"Tuesday", "Shopping"}};
        String[][] fatherSchedule = {{"Monday", "Work"}, {"Wednesday", "Gym"}};
        String[][] child1Schedule = {{"Monday", "School"}, {"Friday", "Play"}};
        String[][] child2Schedule = {{"Tuesday", "School"}, {"Thursday", "Play"}};

        Human mother = new Human("Atakisi", "Atakisiyev", 1990, 120, motherSchedule);
        Human father = new Human("Atabala", "Atabalayev", 1970, 130, fatherSchedule);

        Family family = new Family(mother, father);

        Human child1 = new Human("Qaradas", "Maragli", 2001, 110, child1Schedule);
        Human child2 = new Human("Elixan", "Maragli", 1920, 100, child2Schedule);

        family.addChild(child1);
        family.addChild(child2);

        Pet pet = new Pet("f-16", "Mikayil", 54, 11, new String[]{"Play", "Sleep"});
        family.setPet(pet);


        System.out.println("Family Information:");
        System.out.println(family);

        System.out.println("Deleting a child from the family:");
        boolean deleted = family.deleteChild(child1);
        System.out.println("Child deleted: " + deleted);

        System.out.println("Updated Family Information:");
        System.out.println(family);

        System.out.println("Number of family members: " + family.countFamily());
        family.getPet().foul();
        family.getPet().eat();
        family.getPet().respond();
        mother.greetPet();
        mother.describePet();
        mother.feedPet(true);
    }
}