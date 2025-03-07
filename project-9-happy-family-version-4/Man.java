public class Man extends Human {
    public Man(String name, String familyName, int iq) {
        super(name, familyName, iq);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello, pet! I'm your master."); // salam boss
    }

    @Override
    public void uniqueMethod() {
        System.out.println("I repair cars.");
    }
}
