import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(101);

        System.out.print("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Let the game begin!");

        int[] numbers = new int[100];
        int count = 0;
        boolean running = true;

        while (running) {
            String input = sc.nextLine();
            if (input.matches("-?\\d+")) {
                int guess = Integer.parseInt(input);
                numbers[count++] = guess;
                
                if (guess == number) {
                    System.out.println("Congratulations, " + name + "!");
                    running = false;
                } else {
                    System.out.println(guess > number ? "Your number is too big. Please, try again." : "Your number is too small. Please, try again.");
                }
            } else {
                System.out.println("Please enter a number.");
            }
        }
        
        System.out.println("Your numbers: ");
        Arrays.sort(numbers, 0, count);
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
