/* Task 4: Advanced Array Operations (a)

Implement a method SliceArray that takes an array, a starting index, and an end index, 
then returns a new array containing the elements from the start to the end index. */

package TASK;
import java.util.Arrays;
public class SliceArray {
    public static int[] sliceArray(int[] arr, int start, int end) {
        int length = end - start;
        int[] slice = new int[length];
        System.arraycopy(arr, start, slice, 0, length);
        return slice;
    }
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 2;
        int end = 6;
        int[] slicedArray = sliceArray(originalArray, start, end);
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Slice from index " + start + " to index " + end + ": " 
        + Arrays.toString(slicedArray));
    }
}