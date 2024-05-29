package practice;
import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {1, -9, 0, -6, 5, 45, 34};
        Arrays.sort(arr);
        
        System.out.print("The orginal array are: ");
        for (int i : arr) {
            System.out.print(i);
            System.out.print(" ");
        } 

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) { // optimsation
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("");
        System.out.print("The array after sorting are: ");
        for (int i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}