import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class FamilyTest {
    private Family family;  // Class-level field for test cases
    private Human mother;
    private Human father;
    private Human child1;
    private Human child2;

    @BeforeEach
    void setUp() {
        mother = new Human("babakisi");
        father = new Human("atakisi");
        child1 = new Human("nevekisi");
        child2 = new Human("qardasoglu");

        family = new Family(mother, father);  // Initialize family object before each test
    }

    @Test
    void testToString() {
        family.addChild(child1);
        String expected = "Family{mother=Human{name='babakisi', surname='null', year=0, iq=0, schedule=null}, father=Human{name='atakisi', surname='null', year=0, iq=0, schedule=null}, child=Human{name='nevekisi', surname='null', year=0, iq=0, schedule=null}, pet=POORPET{nickname='null', age=0, trickLevel=0, habits=null}}";
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
}
