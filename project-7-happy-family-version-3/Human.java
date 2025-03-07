
import java.util.*;

enum DayOfWeek {
    monday,tuesday,wednesday,thursday,friday,saturday,sunday
}

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Family family;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getYear() {
        return this.year;
    }

    public int getIq() {
        return this.iq;
    }

    public Pet getPet() {
        return this.pet;
    }

    public Human getMother() {
        return this.mother;
    }

    public Human getFather() {
        return this.father;
    }

    public Family getFamily() {
        return this.family;
    }

    public String[][] getSchedule() {
        return this.schedule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }

    public void greetPet() {
        System.out.println("Hello, " + this.family.getPet().getNickname());
    }

    public void describePet() {
        if (this.family.getPet().getTricklevel() > 50) {
            System.out.println("I have an " + this.family.getPet().getSpecies() + " is " + this.family.getPet().getAge() + " years old, he is " + "very sly");
        } else {
            System.out.println("I have an " + this.family.getPet().getSpecies() + " is " + this.family.getPet().getAge() + " years old, he is " + "almost not sly");
        }
    }

    public boolean feedPet(boolean isTime) {
        if (isTime) {
            System.out.println("Hm... I will feed " + name + "'s " + family.getPet().getSpecies());
            return true;
        } else {
            Random random = new Random();
            int randomNum = random.nextInt(101);
            if (family.getPet().getTricklevel() > randomNum) {
                System.out.println("Hm... I will feed " + name + "'s " + family.getPet().getSpecies());
                return true;
            } else {
                System.out.println("I think " + name + "'s " + family.getPet().getSpecies() + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Arrays.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.deepHashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", schedule=" + Arrays.deepToString(schedule) + "}";
    }

    // override for finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("haha lol :D human is removed bro");
    }
}
