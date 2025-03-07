import java.util.Scanner;

public class WithoutLambda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        PerformOperation isOdd = new PerformOperation() {
            public boolean test(int n) {
                return n % 2 != 0;
            }
        };

        PerformOperation isPrime = new PerformOperation() {
            public boolean test(int n) {
                if (n <= 1) return false;
                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) return false;
                }
                return true;
            }
        };

        PerformOperation isPalindrome = new PerformOperation() {
            public boolean test(int n) {
                int original = n, reverse = 0, digit;
                while (n != 0) {
                    digit = n % 10;
                    reverse = reverse * 10 + digit;
                    n /= 10;
                }
                return original == reverse;
            }
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

    interface PerformOperation {
        boolean test(int n);
    }
}
