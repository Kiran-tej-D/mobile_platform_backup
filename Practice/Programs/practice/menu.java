package practice;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the choice [1, 2, 3, 4]: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("case 1 is executed");
                break;
            case 2:
                System.out.println("case 2 is executed");
                break;
            case 3:
                System.out.println("case 3 is executed");
                break;
            case 4:
                System.out.println("case 4 is executed");
                break;

            default:
                System.out.println("Enter valid choice");
                break;
        }
        sc.close();
    }
}
