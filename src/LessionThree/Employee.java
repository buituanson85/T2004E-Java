package LessionThree;

import java.util.Scanner;

public class Employee {
    private String name;
    private String address;
    private String phoneNumber;
    private String yearOfBirth;
    private String yearInToTheCompany;

    // Constructor
    public Employee(){

    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee's name");
        name = sc.nextLine();
        System.out.println("Enter the employee's address");
        address = sc.nextLine();
        System.out.println("Enter the employee's phone number");
        phoneNumber = sc.nextLine();
        System.out.println("Enter the employee's year of birth");
        yearOfBirth = sc.nextLine();
        System.out.println("Enter the year in the company");
        yearInToTheCompany = sc.nextLine();
    }

    //tạo hàm show thông tin các nhân viên

    public void showInfo(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", name, address, phoneNumber, yearOfBirth, yearInToTheCompany);
    }

    // get and set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
