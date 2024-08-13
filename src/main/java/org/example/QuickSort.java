package org.example;

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = (low - 1); // Index of the smaller element

        // Loop elements and rearrange them based on the pivot
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++; // Increment (add) index of the smaller element

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] with the pivot element
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    // Function to perform quick sort on the array
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Sort elements before and after partition
            quickSort(arr, low, pi - 1); // Sort the left side of the pivot
            quickSort(arr, pi + 1, high); // Sort the right side of the pivot
        }
    }

    // Main method to test example 1
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length; // Get the length of the array
        quickSort(arr, 0, n-1); // Call the quick sort function

        // Print the sorted array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


