package BaiTap_04;

import java.util.Scanner;

public class Employee {
    String fullName;
    String gender;
    String address;
    String position;
    double salary;

    public Employee() {
    }

    public Employee(String fullName, String gender, String address, String position, double salary) {
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0){
            this.salary = salary;
        }else {
            System.out.println("truyền sai dữ liệu");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public  void Input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        fullName = sc.nextLine();

        System.out.println("Nhập giới tính: ");
        gender = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();

        System.out.println("Nhập chức danh: ");
        position = sc.nextLine();

        System.out.println("Nhập lương: ");
        salary = Double.parseDouble(sc.nextLine());
    }

    public void Display(){
        System.out.println(toString());
    }

}
