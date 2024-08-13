package org.example;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        // Loop through all elements in the array
        for (int i = 0; i < n-1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n-i-1; j++) {
                // If the current element is greater than the next element
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];  // Store the value of arr[j] in a temp variable
                    arr[j] = arr[j+1];  // Assign the value of arr[j+1] to arr[j]
                    arr[j+1] = temp;    // Assign the stored value to arr[j+1]
                }
            }
        }
    }

    // Main method to test for example 1
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;  // Get the length of the array
        bubbleSort(arr, n);  // Call the bubble sort function

        // Prints the sorted array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

