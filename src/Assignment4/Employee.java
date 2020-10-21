package Assignment4;

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String yearOfBirth;
    private String yearInToTheCompany;

    //Tạo constructor không có đối số

    public Employee() {
    }

    //tạo constructor có đối số

    public Employee(int id, String name, String address, String phoneNumber, String yearOfBirth, String yearInToTheCompany) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
        this.yearInToTheCompany = yearInToTheCompany;
    }

    //tạo get set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    //tạo toString

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", yearInToTheCompany='" + yearInToTheCompany + '\'' +
                '}';
    }
}
