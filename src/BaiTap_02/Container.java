package BaiTap_02;

import java.util.Scanner;

public class Container extends Vehicle {
    public Container() {
        super(3, 5);
    }

    @Override
    public void Input(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Nhập nhà sản xuất: ");
        manufacturer = sc.nextLine();

        System.out.println("Nhập biển số xe: ");
        carNo = sc.nextLine();

        System.out.println("Nhập năm sản xuất: ");
        year = sc.nextLine();
    }
}
