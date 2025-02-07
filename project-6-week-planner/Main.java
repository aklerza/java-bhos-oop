import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] schedule = {
            {"Sunday", "do homework"},
            {"Monday", "go to courses; watch a film"},
            {"Tuesday", "go to the gym"},
            {"Wednesday", "go on a date"},
            {"Thursday", "hang out with friends"},
            {"Friday", "practice guitar"},
            {"Saturday", "go for a walk"}
        };
        
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        
        while (isRunning) {
            System.out.print("Please, input the day of the week: ");
            String input = sc.nextLine().trim().toLowerCase();
            
            if (input.equals("exit")) {
                isRunning = false;
            } else if (input.startsWith("change") || input.startsWith("reschedule")) {
                String[] parts = input.split(" ", 2);
                if (parts.length < 2) {
                    System.out.println("Invalid command. Try again.");
                    continue;
                }
                
                String day = parts[1].trim().toLowerCase();
                boolean found = false;
                for (int i = 0; i < schedule.length; i++) {
                    if (schedule[i][0].toLowerCase().equals(day)) {
                        System.out.print("Please, input new tasks for " + schedule[i][0] + ": ");
                        schedule[i][1] = sc.nextLine();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            } else {
                boolean found = false;
                for (String[] day : schedule) {
                    if (day[0].toLowerCase().equals(input)) {
                        System.out.println("Your task for " + day[0] + ": " + day[1]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            }
        }
        
        sc.close();
    }
}
