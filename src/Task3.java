import java.util.Arrays;

public class Task3 {

    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param arr1 The first sorted array.
     * @param arr2 The second sorted array.
     * @return A sorted array containing all elements from both input arrays.
     */
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        // Create a result array to store the merged elements
        int[] result = new int[n1 + n2];

        // Indices for traversing arr1, arr2, and the result array
        int i = 0, j = 0, k = 0;

        // Merge the arrays while both have elements left to process
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++]; // Add from arr1 if it's smaller or equal
            } else {
                result[k++] = arr2[j++]; // Add from arr2 if it's smaller
            }
        }

        // If there are remaining elements in arr1, add them to result
        while (i < n1) {
            result[k++] = arr1[i++];
        }

        // If there are remaining elements in arr2, add them to result
        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result; // Return the merged and sorted array
    }

    public static void main(String[] args) {
        // Test cases for merging sorted arrays
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1, 5}, new int[]{2, 3, 4})));
    }
}
