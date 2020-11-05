package LessionThree;

import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        Employee employee = new Employee();
        do {
            System.out.println("-----------------------------------");
            System.out.println("Employee management system");
            System.out.println("1.Add new employees");
            System.out.println("2.Display employee information");
            System.out.println("3.Change of employee address");
            System.out.println("4.Exit");
            System.out.println("---------------------------------");
            System.out.println("Enter choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> employee.inputInfo();
                case 2 -> {
                    System.out.println("Staff information");
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "name", "address", "phoneNumber", "yearOfBirth", "yearInToTheCompany");
                    employee.showInfo();
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.println("Enter a new address");
                    String addressNew = sc.nextLine();
                    employee.setAddress(addressNew);
                    employee.showInfo();
                }
                case 4 -> System.out.println("Exit.");
                default -> System.err.println("Choosing the wrong");
            }
        }while (choice !=4 );
    }
}


