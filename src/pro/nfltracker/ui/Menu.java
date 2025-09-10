/* Displays the menu and welcome header

 */

package pro.nfltracker.ui;

import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);

    public void show() {
        int choice = -1;
        Headers.display();

        while (choice != 0) {


            // Show the menu options
            System.out.println("=== Main Menu ===");
            System.out.println("1. Add Offensive Stats");
            System.out.println("2. Add Defensive Stats");
            System.out.println("3. View Team Stats");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // Will add input checker in future
            choice = sc.nextInt();

            // Do something based on the user’s choice
            switch (choice) {
                case 1 -> System.out.println("[TODO] Add Offensive Stats\n");
                case 2 -> System.out.println("[TODO] Add Defensive Stats\n");
                case 3 -> System.out.println("[TODO] View Team Stats\n");
                case 0 -> System.out.println("Goodbye! ");
                default -> System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}
