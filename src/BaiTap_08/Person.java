package BaiTap_08;

import java.util.Scanner;

public abstract class Person {
    private String name;
    private String gender;
    private String address;
    private String birthday;

    public Person() {
    }

    public Person(String name, String gender, String address, String birthday) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name= " + name + ", gender= " + gender + ", address= " + address + ", birthday= " + birthday;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên sinh viên: ");
        name = sc.nextLine();

        System.out.println("Nhập giới tính sinh viên: ");
        gender = sc.nextLine();

        System.out.println("Nhập địa chỉ sinh viên: ");
        address = sc.nextLine();

        System.out.println("Nhập ngày sinh sinh viên: ");
        birthday = sc.nextLine();
    }

    public void showInfo(){
        System.out.println(toString());
    }
}


