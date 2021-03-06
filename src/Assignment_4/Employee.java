package Assignment_4;

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
        System.out.println("Mời bạn nhập tên nhân viên");
        name = sc.nextLine();
        System.out.println("Mời bạn nhập địa chỉ nhân viên");
        address = sc.nextLine();
        System.out.println("Mời bạn nhập số điện thoại nhân viên");
        phoneNumber = sc.nextLine();
        System.out.println("Mời bạn nhập năm sinh nhân viên");
        yearOfBirth = sc.nextLine();
        System.out.println("Mời bạn nhập năm vào công ty nhân viên");
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

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getYearInToTheCompany() {
        return yearInToTheCompany;
    }

    public void setYearInToTheCompany(String yearInToTheCompany) {
        this.yearInToTheCompany = yearInToTheCompany;
    }
}
