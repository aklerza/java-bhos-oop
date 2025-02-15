
import java.util.*;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public String getSpecies() {
        return this.species;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getAge() {
        return this.age;
    }

    public int getTricklevel() {
        return this.trickLevel;
    }

    public String getHabits() {
        return String.join(", ", this.habits);
    }

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
    public Pet() {
    }

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

    // override thing
    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    // override thing
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits);
    }

    // override for toString
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + java.util.Arrays.toString(habits) + "}";
    }
}
