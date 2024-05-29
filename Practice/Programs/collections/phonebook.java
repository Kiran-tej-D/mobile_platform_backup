package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phonebook {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Phonebook Menu:");
            System.out.println("1. Add contact");
            System.out.println("2. Find contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phonebook.put(name, phoneNumber);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.print("Enter name to find: ");
                    String searchName = scanner.nextLine();
                    String number = phonebook.get(searchName);
                    if (number != null) {
                        System.out.println("Phone number for " + searchName + ": " + number);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting phonebook. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}






