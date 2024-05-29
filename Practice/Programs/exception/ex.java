package exception;

public class ex {
    public static void main(String[] args){
        
        try {
            int result = 3/0;
            String[] arr = {"a","b","c"};
            System.out.println(result);
            System.out.println(arr[4]);
        } catch (Exception e) {
            System.out.println("Error: Can't divide by zero" + e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Hello kiran");
    }
}
