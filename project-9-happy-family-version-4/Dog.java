public class Dog extends Pet implements Foulable {  

    // Constructor  
    public Dog() {  
        super();  
        this.species = Species.DOG; // Set species to Dog  
    }  

    // Respond method override  
    @Override  
    public void respond() {  
        System.out.println("The dog barks.");  
    }  

    // Foul method override  
    @Override  
    public void foul() {  
        System.out.println("The dog digs a hole.");  
    }  
}  
