// Program to find the maximum element in an array

import java.util.Scanner;

public class MaxElement {

    static int maxElement(int[] arr) {

        int max = arr[0];         // Initialize max with the first element of the array

        for (int i = 0; i < arr.length; i++){

            if (arr[i] > max) {

                max = arr[i];
            }
        }

        return max;
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

        // Call the maxElement function to find the maximum element in the array  
        int max = maxElement(arr);

        System.out.print("Maximum element: " + max);

        System.out.println(); // Print a new line
    }

}
