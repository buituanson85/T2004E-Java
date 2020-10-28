package com.qlsv.thongtinsinhvien;

import Assignment7.Student;

import java.util.Scanner;

public class SinhVien {
    private String fullName;
    private int age;
    private String address;
    private int yearBird;
    private String sex;
    private String phone;
    private String facebook;

    public SinhVien() {
    }

    public SinhVien(String fullName, int age, String address, int yearBird, String sex, String phone, String facebook) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.yearBird = yearBird;
        this.sex = sex;
        this.phone = phone;
        this.facebook = facebook;
    }

    public  void Nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's name: ");
        this.fullName = sc.nextLine();

        System.out.println("Enter your student's address: ");
        this.address = sc.nextLine();

        System.out.println("Enter student gender: ");
        this.sex = sc.nextLine();

        System.out.println("Enter the student's phone number: ");
        this.phone = sc.nextLine();

        System.out.println("Enter the student facebook link: ");
        this.facebook = sc.nextLine();

        System.out.println("Enter the student year: ");
        this.yearBird = sc.nextInt();

        System.out.println("Enter the student's age: ");
        this.age = sc.nextInt();
    }

    public void hienthi(){
        System.out.printf("Ten: %s, Dia chi: %s,SDT: %s,Gioi Tinh: %s, fb: %s,nam sinh: %d, tuoi: %d.%n", this.fullName,this.address,
                this.phone,this.sex,this.facebook,this.yearBird,this.age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearBird() {
        return yearBird;
    }

    public void setYearBird(int yearBird) {
        this.yearBird = yearBird;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }


}
