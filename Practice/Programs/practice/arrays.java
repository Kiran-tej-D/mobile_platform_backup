package practice;
public class arrays {
    public static void main(String[] args) {
        String arr[] = new String[4];
        arr[0] = "Kiran" ;
        arr[1] = "Somu" ;
        arr[2] = "Loki" ;
        arr[3] = "Sreedhar" ;
        System.out.println("Previous: ");
        for (String str : arr) {
            System.out.print(str + ", ");
        }
        System.out.println("\nNew: ");
        String temp = arr[0]; //swapping
        arr[0] = arr[1];
        arr[1] = temp;

        for (String str : arr) {
            System.out.print(str + ", ");
        }
        System.out.println(arr[arr.length - 1]); // print the last element
    }
}
    

