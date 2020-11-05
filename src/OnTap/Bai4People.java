package OnTap;

import java.util.Scanner;

public class Bai4People {
    String name,address;

    public Bai4People() {
    }

    public Bai4People(String name, String address) {
        this.name = name;
        this.address = address;
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

    @Override
    public String toString() {
        return "name='" + name + ", address='" + address ;
    }

    public  void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên");
        name = sc.nextLine();

        System.out.println("Nhập địa chỉ");
        address = sc.nextLine();
    }

    public void display(){
        System.out.println(toString());
    }
}
