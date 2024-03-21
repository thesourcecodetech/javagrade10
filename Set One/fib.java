import java.util.*;

class fib {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci series:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
