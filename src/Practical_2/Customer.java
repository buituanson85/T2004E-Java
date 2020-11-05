package Practical_2;

import java.util.Scanner;

public class Customer {
    String name, phone, email;

    public Customer() {
    }

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter Email: ");
        email = sc.nextLine();
        System.out.println("Enter phone: ");
        phone = sc.nextLine();
    }

    public void display(){
        System.out.format("%-20s %-20s %-20s", name, email, phone);
        System.out.println(" ");
    }
}
