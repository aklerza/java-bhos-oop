public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public String getName() { return this.name; }
    public String getSurname() { return this.surname; }
    public int getYear() { return this.year; }
    public int getIq() { return this.iq; }
    public Pet getPet() { return this.pet; }
    public Human getMother() { return this.mother; }
    public Human getFather() { return this.father; }

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
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        if (pet.getTricklevel() > 50) {
            System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is " + "very sly");
        } else {
            System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is " + "almost not sly");
        }
    }

    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", mother=" + (mother != null ? mother.name + " " + mother.surname : "") + ", father=" + (father != null ? father.name + " " + father.surname : "") + ", pet=" + (pet != null ? pet.toString() : "") + "}";
    }
}
