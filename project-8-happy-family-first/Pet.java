public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    // all fields
    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    // only nickname and species
    public Pet(String nickname, String species) {
        this.nickname = nickname;
        this.species = species;
    }

    // empty constructor
    public Pet() {}

    // eat message
    public void eat() {
        System.out.println("I am eating");
    }

    // respond
    public void respond() {
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    // foul method
    public void foul() {
        System.out.println("I need to cover it up");
    }

    // override for toString
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + java.util.Arrays.toString(habits) + "}";
    }
}