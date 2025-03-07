import java.util.Scanner;

public class WithLambda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        PerformOperation isOdd = (n) -> n % 2 != 0;
        PerformOperation isPrime = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        PerformOperation isPalindrome = (n) -> {
            int original = n, reverse = 0, digit;
            while (n != 0) {
                digit = n % 10;
                reverse = reverse * 10 + digit;
                n /= 10;
            }
            return original == reverse;
        };

        while (testCases-- > 0) {
            int condition = sc.nextInt();
            int number = sc.nextInt();

            boolean result = false;
            switch (condition) {
                case 1:
                    result = isOdd.test(number);
                    break;
                case 2:
                    result = isPrime.test(number);
                    break;
                case 3:
                    result = isPalindrome.test(number);
                    break;
            }

            System.out.println(result ? "YES" : "NO");
        }

        sc.close();
    }

    @FunctionalInterface
    interface PerformOperation {
        boolean test(int n);
    }
}
