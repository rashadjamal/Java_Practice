import java.util.Scanner;;

public class Fiboncci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1;
        System.out.println("Fibonccaci Series");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
