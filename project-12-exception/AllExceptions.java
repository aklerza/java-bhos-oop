import java.util.ArrayList;
import java.util.List;

public class AllExceptions {
    public static void recursive() {
        recursive();
    }
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        }
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException caught: " + e);
        }
        List<int[]> list = new ArrayList<>();
        try {
            while (true) {
                list.add(new int[1000000]);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught: " + e);
        }
        try {
            recursive();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught: " + e);
        }
    }
}
