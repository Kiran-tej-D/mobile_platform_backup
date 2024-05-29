public class exceptionHandling {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        
        try {
            int result = a/b;
            System.out.println("the result is: " + result);
        } catch (Exception e) {
            System.out.println("ERROR: Division by 0 is  not allowed " + e.getMessage());
        }
    }
}



