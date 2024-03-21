import java.util.*;

class linearsearch {
   void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
