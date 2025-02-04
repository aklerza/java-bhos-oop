public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human() {}

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        if (pet.trickLevel > 50) {
            System.out.println("I have an " + pet.species + " is " + pet.age + " years old, he is " + "very sly");
        } else {
            System.out.println("I have an " + pet.species + " is " + pet.age + " years old, he is " + "almost not sly");
        }
    }

    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", mother=" + (mother != null ? mother.name + " " + mother.surname : "") + ", father=" + (father != null ? father.name + " " + father.surname : "") + ", pet=" + (pet != null ? pet.toString() : "") + "}";
    }
}
