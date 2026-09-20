import java.util.Scanner;

public class ArraySum {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum = 0;

        for(int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(); // Print a newline

        // Display the sum of the array elements
        System.out.println("Sum of the array elements is: " + sum);
    }
}


