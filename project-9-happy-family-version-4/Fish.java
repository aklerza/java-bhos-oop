public class Fish extends Pet {
    public Fish() {
        super();
        this.species = Species.FISH;
    };
    // Set species to Fish
    @Override
    public void respond() {
        System.out.println("The fish swishes its tail.");
    }
}
