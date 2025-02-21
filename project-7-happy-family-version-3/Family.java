import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// just a p13c3 0f $h1t f0r junit
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    @BeforeEach
    void setUp() {
        mother = new Human("babakisi");
        father = new Human("atakisi");
        child1 = new Human("nevekisi");
        child2 = new Human("qardasoglu");

        family = new Family(mother, father);
    }

    @Test
    void testToString() {
        family.addChild(child1);
        String expected = "Family{mother=babakisi, father=atakisi, child=nevekisi, pet=POORPET{nickname='null', age=0, trickLevel=0, habits=null}}";
        assertEquals(expected, family.toString());
    }
    @Test
    void testDeleteChildByObject_ChildExists() {
        family.addChild(child1);
        family.addChild(child2);
        assertTrue(family.deleteChild(child1));
        assertFalse(Arrays.asList(family.getChildren()).contains(child1));
    }
    @Test
    void testDeleteChildByObject_ChildNotExists() {
        assertFalse(family.deleteChild(child1));
        assertEquals(0, family.getChildren().length);
    }
    @Test
    void testDeleteChildByIndex_ValidIndex() {
        family.addChild(child1);
        family.addChild(child2);

        assertTrue(family.deleteChild(0));
        assertFalse(Arrays.asList(family.getChildren()).contains(child1));
    }
    @Test
    void testDeleteChildByIndex_InvalidIndex() {
        family.addChild(child1);
        assertFalse(family.deleteChild(5));
        assertEquals(1, family.getChildren().length);
    }
    @Test
    void testAddChild() {
        family.addChild(child1);
        assertEquals(1, family.getChildren().length);
        assertEquals(child1, family.getChildren()[0]);
        assertEquals(family, child1.getFamily());
    }
    @Test
    void testCountFamily() {
        family.addChild(child1);
        family.addChild(child2);
        assertEquals(4, family.countFamily());
    }

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

    // override for finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("oh no! family is removed bro");
    }
}
