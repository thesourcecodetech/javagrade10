import java.util.*;

class btod {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();
        int decimal = 0, base = 1;
        while (binary != 0) {
            int remainder = (int) (binary % 10);
            decimal += remainder * base;
            binary /= 10;
            base *= 2;
        }
        System.out.println("Decimal equivalent: " + decimal);
    }
}
