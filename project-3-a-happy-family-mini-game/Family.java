import java.util.Arrays;
import java.util.Objects;

public class Family {
  private Human mother;
  private Human father;
  private Human[] children;
  private Pet pet;

  public Human getMother() { return this.mother; }
  public Human getFather() { return this.father; }
  public Human[] getChildren() { return children.clone(); }
  public Pet getPet() { return this.pet; }

  public Family(Human mother, Human father) {
    this.mother = mother;
    this.father = father;
    this.children = new Human[0];
  }

  public void addChild(Human child) {
    Human[] newChildren = Arrays.copyOf(children, children.length + 1);
    newChildren[children.length] = child;
    children = newChildren;
    child.setFamily(this);
  }

  public boolean deleteChild(int index) {
    if (index < 0 || index >= children.length) {
      return false;
    }

    Human[] newChildren = new Human[children.length - 1];
    for (int i=0, j=0; i < children.length; i++) {
      if (i != index) {
          newChildren[j++] = children[i];
      }
    }
    children = newChildren;
    return true;
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
}
