package Assignment8;

import java.util.Scanner;

public class Persion {
    private String name;
    private String address;
    private String tel;

    public Persion() {
    }

    public Persion(String name, String address, String tel) {
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public void Display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.println("Nhập so điện thoại: ");
        tel = sc.nextLine();
    }

    public void show(){
        System.out.printf("%s %s %s", name, address, tel);
    }
}
