package BaiTap_05;

import java.util.Scanner;

public class Circle {
    float radius;
    public double getPi(){
        return Math.PI;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính: ");
        radius = sc.nextFloat();
    }

    public float caculateChuvi(){
        return (float) (2 * getPi() * radius);
    }

    public float caculateDienTich(){
        return (float) (getPi() * Math.pow(radius, 2));
    }
}
