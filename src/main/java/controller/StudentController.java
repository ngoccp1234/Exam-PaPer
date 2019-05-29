package controller;

import entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> listStudent = new ArrayList<Student>();

    public void addStudent() {
        while (true) {
            System.out.println("--------ADD STUDENT----------");
            System.out.println("Please enter Enroll ID: ");
            String enrollID = scanner.nextLine();
            System.out.println("Please enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.println("Please enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.println("Plese enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            Student student = new Student(enrollID, firstName, lastName, age);
            listStudent.add(student);
            break;
        }
    }

    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter("src/main/resources/Students.dat");
        fileWriter.write("EnrolID\t"+ "FullName\t"+ "Age"+ "\n");
        fileWriter.write("--------"+"  "+"---------"+"  "+"------\n");
        for (Student student:
                listStudent) {
            fileWriter.write(student.getEnrollID() + "        " + student.getFirstName()+" "+student.getLastName()+"       "+student.getAge()+ "\n");
        }
        fileWriter.close();
    }

    public void display() throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/Students.dat");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
