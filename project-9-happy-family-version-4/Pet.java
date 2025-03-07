public abstract class Pet {
    protected Species species;

    public Pet() {
          // Default to UNKNOWN
        this.species = Species.UNKNOWN;
    }

    public abstract void respond();

    public void eat() {
        System.out.println("This pet is eating."); // pet is eating :thumb_up:
    }
}
