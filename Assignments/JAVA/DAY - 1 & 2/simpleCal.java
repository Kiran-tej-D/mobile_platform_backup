import java.util.Scanner;
public class simpleCal{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number a");
        double num1 = sc.nextDouble();

        System.out.println("Enter the Operator (+, -, *, /)");
        char op = sc.next().charAt(0);

        System.out.println("Enter the number b");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    result = num1/num2;
                } else{
                    System.out.println("Division by zero..!");
                    //return;
                }
                break;
            default:
                System.out.println("Invalid operator...!");
                //return;
        }
        System.out.println("result is: " + result);
        sc.close();
    }
}



