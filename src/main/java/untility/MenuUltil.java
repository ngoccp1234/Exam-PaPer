package untility;

import controller.StudentController;

import java.io.IOException;
import java.util.Scanner;

public class MenuUltil {
    StudentController studentController = new StudentController();
    Scanner scanner = new Scanner(System.in);

    public void menu() throws IOException {
        while (true) {
            System.out.println("------MENU MANAGE STUDENTS-------");
            System.out.println("1. Add new student.");
            System.out.println("2. Save.");
            System.out.println("3. Display all students.");
            System.out.println("4. Exit.");
            System.out.println("----------------------------------");
            System.out.println("Plese enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentController.addStudent();
                    break;
                case 2:
                    studentController.save();
                    break;
                case 3:
                    studentController.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong choice, please choose again 1 to 4.");
                    break;
            }
            if (choice == 4) {
                System.out.println("See you again!");
                break;
            }
        }
    }
}
