package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
   static ArrayList<Employee> arr = new ArrayList<>();

   //Tạo hàm add nhân viên

    public static void AddEmployee(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter employee id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the employee's name: ");
        String names = sc.nextLine();

        System.out.println("Enter the employee's address: ");
        String addresss = sc.nextLine();

        System.out.println("Enter the student's phone number: ");
        String phones = sc.nextLine();

        System.out.println("Enter the employee's year of birth: ");
        String yob = sc.nextLine();

        System.out.println("Enter five employees into the company: ");
        String yittc = sc.nextLine();
        //khởi tạo đối tượng -->gọi contructor có đối số
        Employee employee = new Employee(id, names, addresss, phones, yob, yittc);
        //thêm đối tượng vào arraylist
        arr.add(employee);
    }

    //tạo hàm show nhân viên

    public static void ShowEmployee(){
        System.out.println("=== List of company employees. ===");
        //for each
        for (Employee a : arr){
            System.out.println(a.toString());
        }
    }

    //sửa nhân viên
    public static void EditEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id to correct");
        int id = sc.nextInt();
        boolean search = false;
        for (Employee employee : arr) {
            if (id == employee.getId()) {
                System.out.println("Enter a new address");
                sc.nextLine();
                String adresss = sc.nextLine();
                employee.setAddress(adresss);
                search = true;
                break;
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
        System.out.println("===== Employee management system =====");
        System.out.println("1.Add Employee");
        System.out.println("2.Show to employee");
        System.out.println("3.Edit adress employee");
        System.out.println("0.Exit");
        System.out.println("======================================");
        int choice;
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt(); //nhập lựa chọn

        switch (choice) {
            case 1 -> AddEmployee();
            case 2 -> ShowEmployee();
            case 3 -> EditEmployee();
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
