// Program to find the minimum element in an array

import java.util.Scanner;

public class MinElement {

    static int minElement(int[] arr) {

        int min = arr[0];         // Initialize min with the first element of the array

        for (int i = 0; i < arr.length; i++){

            if (arr[i] < min) {

                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int [size];

        for (int i = 0; i < size; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Call the minElement function to find the minimum element in the array
        int min = minElement(arr);

        System.out.print("Minimum element: " + min);

        System.out.println(); // Print a new line
    }
}

