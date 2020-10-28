package Assignment6;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        Student[] sinhviens = new Student[255];
        Student sinhvien = new Student();
        int counter = 0;
        do {
            System.out.println("-------");
            System.out.println("1.Add new students");
            System.out.println("2.Print out the student's name and phone number");
            System.out.println("3.Find out students age > 1993, print their full name and year of birth");
            System.out.println("4.Print out students who are male and have age > = 1995");
            System.out.println("5.Exit");
            System.out.println("-------");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the number of employees to add: ");
//                    n = sc.nextInt();
//
//                    for (int i = 0; i < n; i++) {
//                        System.out.println("=== Enter student information : " + (i + 1) + " ===");
//                        assert sinhvien != null;
                        assert sinhvien != null;
                        sinhvien.InputInfo();
                        sinhviens[counter++] = sinhvien;
//                    }
                }

                case 2 -> {
                    System.out.printf("%-20s %-20s \n", "fullName", "phone");
                    for (int i = 0; i < counter; i++) {
                        sinhvien = sinhviens[i];
                        if (sinhvien != null) {
                            sinhvien.ShowInfo();
                        }
                    }
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.printf("%-20s %-20s \n", "fullName", "YearBird");
                    for (int i = 0; i < counter; i++) {
                        sinhvien = sinhviens[i];
                        if (sinhviens[i].getYearBird() < 1993) {  //kiểm tra nhập vào đúng chuỗi dấy chưa
                            sinhvien.ShowInfoYear();
                        }
                    }
                }
                case 4 -> {
                    sc.nextLine();
                    System.out.printf("%-20s %-20s \n", "fullName", "YearBird");
                    String sexSearch = "Nam";
                    for (int i = 0; i < counter; i++) {
                        sinhvien = sinhviens[i];
                        if (sinhviens[i].getSex().equalsIgnoreCase(sexSearch) && sinhviens[i].getYearBird() <= 1995) {  //kiểm tra nhập vào đúng chuỗi dấy chưa
                            sinhvien.ShowInfoYear();
                        }
                    }
                }
                default -> System.out.println("Reselect...");
            }
        }while(choice != 5);
        System.out.println("END.......");
    }
}
