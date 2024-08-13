package org.example;

public class CountingSort {
    public static String countSort(String arr) {
        int n = arr.length();  // Get the length of the input string

        char[] output = new char[n];  // Create an output array to store the sorted characters
        int[] count = new int[256];   // Create a count array to store the frequency of each character

        // Initialize count array with all zeros
        for (int i = 0; i < 256; i++) {
            count[i] = 0;
        }

        // Store the frequency of each character in the count array
        for (int i = 0; i < n; i++) {
            count[arr.charAt(i)]++;
        }

        // Update the count array so that each element at index (i) stores
        // the sum of previous counts (the position of characters)
        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        // Loop the output character array by placing characters in their correct positions
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr.charAt(i)] - 1] = arr.charAt(i);
            count[arr.charAt(i)]--;  // Decrease count for the current character
        }

        // Converting character array to a string and return it
        return new String(output);
    }

    // Main method to test example 1
    public static void main(String[] args) {
        String str = "edsab";
        System.out.println(countSort(str));  // Calling the counting sort function
    }
}

