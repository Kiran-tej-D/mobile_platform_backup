/* Task 3: Understanding Functions through Arrays

Write a recursive function named SumArray that calculates and 
returns the sum of elements in an array, demonstrate with example*/

package TASK;
public class RecSumArr {
    public static int sumArray(int[] arr) {
        return sumArrayHelper(arr, 0);
    }
    private static int sumArrayHelper(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }return arr[index] + sumArrayHelper(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5};
        int sum = sumArray(exampleArray);
        System.out.println("Sum of the elements in the array: " + sum);
    }
}