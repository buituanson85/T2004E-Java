package Assignment7;

import Assignment4.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManeger {
    static ArrayList<Student> arr = new ArrayList<>();

    //Tạo hàm add nhân viên

    public static void AddStudent(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's name: ");
        String fullName = sc.nextLine();

        System.out.println("Enter the student's age: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter your student's address: ");
        String address = sc.nextLine();

        System.out.println("Enter the student year: ");
        int yearBird = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter student gender: ");
        String sex = sc.nextLine();

        System.out.println("Enter the student's phone number: ");
        int phone = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the student facebook link: ");
        String facebook = sc.nextLine();

        Student student = new Student(fullName, age, address, yearBird, sex, phone, facebook);
        //thêm đối tượng vào arraylist
        arr.add(student);
    }

    //tạo hàm show sinh viên

    public static void ShowStudent(){
        System.out.println("=== List of company Student. ===");
        //for each
        for (Student student : arr){
            System.out.println(student.toString());
        }
    }

    //tạo hàm những sinh viên có tuổi > 1993>

    public static void ShowStudent2(){

        for (Student student : arr) {
            if (student.getYearBird() < 1993) {  //kiểm tra nhập vào đúng chuỗi dấy chưa
                System.out.println(student.toString());
            }
        }
    }
    //tạo hàm tìm sinh viên

    public static void SearchStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name to correct");
        String fullNames = sc.nextLine();
        boolean search = false;
        for (Student student : arr) {
            if (fullNames.equals(student.getFullName())) {
                search = true;
                System.out.println(student.toString());
            }
        }
        if (!search){
            System.out.println("No staff found");
        }
    }

    //Tạo hàm Exit
    public static void Exit(){
        System.out.println("GoodBye");
        System.exit(0);
    }

    //Tạo hàm menu
    public static void Menu(){
        System.out.println("===== Student management system =====");
        System.out.println("1.Add student");
        System.out.println("2.Show to student");
        System.out.println("3.Find out students age > 1993, print their full name and year of birth");
        System.out.println("4.Search student by name");
        System.out.println("0.Exit");
        System.out.println("======================================");
        int choice;
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt(); //nhập lựa chọn

        switch (choice) {
            case 1 -> AddStudent();
            case 2 -> ShowStudent();
            case 3 -> ShowStudent2();
            case 4 -> SearchStudent();
            case 0 -> Exit();
        }
    }

    //Hàm main
    public static void main(String[] args) {
        while (true){
            Menu();
        }
    }
}
