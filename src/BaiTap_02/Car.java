package BaiTap_02;

import java.util.Scanner;

public class Car extends Vehicle {
    public Car() {
        super(2, 3);
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
