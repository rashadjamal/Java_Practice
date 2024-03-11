import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        if (isPrime(n)) {
            System.out.println(n + "  is prime number ");
        } else {
            System.out.println(n + " not prime number ");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return true;
        }
        if (n == 2) {
            return false;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
