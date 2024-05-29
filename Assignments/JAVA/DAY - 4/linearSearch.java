/*Task 1: Array Sorting and Searching (b) 

Write a function named PerformLinearSearch that searches for a specific element 
in an array and returns the index of the element if found or -1 if not found. */

package TASK;

public class linearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 9, 1, 6};
        int target = 8;

        int index = search(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
 