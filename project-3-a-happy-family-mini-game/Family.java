
import java.util.*;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Human getMother() {
        return this.mother;
    }

    public Human getFather() {
        return this.father;
    }

    public Human[] getChildren() {
        return children.clone();
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = new Pet();
        mother.setFamily(this);
        father.setFamily(this);
    }

    public void addChild(Human child) {
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
        child.setFamily(this);
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < children.length; i++) {
            if (children[i] == child) {
                for (int j = i; j < children.length - 1; j++) {
                    children[j] = children[j + 1];
                }
                children = Arrays.copyOf(children, children.length - 1);
                child.setFamily(null);
                return true;
            }
        }
        return false;
    }

    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public String toString() {
        StringBuilder familyString = new StringBuilder();
        familyString.append("Family{mother=").append(mother).append(", father=").append(father);
        for (Human child : children) {
            familyString.append(", child=").append(child);
        }
        familyString.append(", pet=").append(pet).append("}");
        return familyString.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
