import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        for (int i = 0; i < size; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println(); // Print a newline

        // Display the elements of the array in reverse order
        System.out.println("The elements of the array in reverse order are: ");
        
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Print a newline at the end
    }
}

