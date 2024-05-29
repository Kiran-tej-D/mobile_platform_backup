/* Task 4: Advanced Array Operations (b)

Create a recursive function to find the nth element of a Fibonacci sequence and store the 
first n elements in an array.*/

package TASK;
import java.util.Arrays;
public class Fibb {
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static long[] fibonacciSequence(int n) {
        long[] sequence = new long[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = fibonacci(i);
        } return sequence;
    }
    public static void main(String[] args) {
        int n = 10;
        long[] fibonacciArray = fibonacciSequence(n);
        System.out.println("First " + n + " elements of the Fibonacci sequence:");
        System.out.println(Arrays.toString(fibonacciArray));
        int nthElement = 8;
        System.out.println("The " + nthElement + "th element of the Fibonacci sequence is: " 
        + fibonacci(nthElement));
    }
}