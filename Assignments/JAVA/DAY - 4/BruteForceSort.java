/*Task 1: Array Sorting and Searching (a)

Implement a function called BruteForceSort that sorts an array using the brute force approach. 
Use this function to sort an array created with InitializeArray. */

package TASK;

public class BruteForceSort {
    public static void bruteForceSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = initializeArray(10);
        System.out.println("Original array:");
        printArray(arr);
        
        bruteForceSort(arr);
        
        System.out.println("\nSorted array:");
        printArray(arr);
    }

    public static int[] initializeArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
