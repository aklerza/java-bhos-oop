public abstract class Human {
    protected String name;
    protected String familyName;
    protected int iq;

    public Human(String name, String familyName, int iq) {
        this.name = name;
        this.familyName = familyName;
        this.iq = iq;
    }

    public abstract void greetPet();

    public abstract void uniqueMethod(); // For example, kitchen jobs for women, fight for men
}
