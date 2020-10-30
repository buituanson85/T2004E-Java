package BaiTap_05;

import java.util.Scanner;

public class HinhChuNhat {
    float width;
    float height;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài: ");
        width = sc.nextFloat();

        System.out.println("Nhập vào chiều cao: ");
        height = sc.nextFloat();
    }

    public float caculateDienTich(){
        return width * height;
    }

    public float caculateChuVi(){
        return 2 * (width + height);
    }
}
