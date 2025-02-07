import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] grid = new char[5][5];
        for (char[] row : grid) {
            Arrays.fill(row, '-');
        }
        
        System.out.println("All set. Get ready to rumble!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetX = random.nextInt(5) + 1;
        int targetY = random.nextInt(5) + 1;
        boolean isRunning = true;
        
        while (isRunning) {
            System.out.print("Enter coordinates: ");
            String input = scanner.nextLine();
            String[] coordinates = input.split(" ");
            
            if (coordinates.length == 2) {
                try {
                    int x = Integer.parseInt(coordinates[0]);
                    int y = Integer.parseInt(coordinates[1]);
                    
                    if (x >= 1 && x <= 5 && y >= 1 && y <= 5) {
                        if (x == targetX && y == targetY) {
                            System.out.println("You have won!");
                            grid[x - 1][y - 1] = 'x';
                            isRunning = false;
                        } else {
                            grid[x - 1][y - 1] = '*';
                        }
                        
                        printGrid(grid);
                    } else {
                        System.out.println("Please enter valid numbers between 1 and 5.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter valid numbers.");
                }
            } else {
                System.out.println("Please enter two numbers.");
            }
        }
    }
    
    private static void printGrid(char[][] grid) {
        System.out.print("  | ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
