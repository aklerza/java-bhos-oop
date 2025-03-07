import java.util.Random;

public class Family implements HumanCreator {
    private String familyName;
    private Man father;
    private Woman mother;

    public Family(String familyName, Man father, Woman mother) {
        this.familyName = familyName;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public Human bornChild() {
        Random random = new Random();
        boolean isMale = random.nextBoolean();
        String childName = (isMale ? "Elxan" : "Sirxan");
        int averageIq = (father.iq + mother.iq) / 2;
        return isMale ? new Man(childName, familyName, averageIq) : new Woman(childName, familyName, averageIq);
    }
}
