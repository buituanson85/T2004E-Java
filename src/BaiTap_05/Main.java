package BaiTap_05;

import java.util.Scanner;

public class Main {
    static void ShowMenu(){
        System.out.println("1.Nhập thông tin hình tròn");
        System.out.println("2.Tính chu vi hình tròn");
        System.out.println("3.Tính diện tích hình tròn");
        System.out.println("4.Nhập thông tin hình chữ nhật");
        System.out.println("5.Tính chu vi hình cn");
        System.out.println("6.Tính diện tích hình cn");
        System.out.println("7.Thoát");
        System.out.println("choose : ");
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        int choose;
        Scanner sc = new Scanner(System.in);

        do {
            ShowMenu();
            choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1:
                    circle.Input();
                    break;
                case 2:
                    System.out.println("Chu vi hình tròn");
                    circle.caculateChuvi();
                    break;
                case 3:
                    System.out.println("diện hình tròn");
                    circle.caculateDienTich();
                    break;
                case 4:
                    hinhChuNhat.Input();
                    break;
                case 5:
                    System.out.println("Chu vi hình cn");
                    hinhChuNhat.caculateChuVi();
                    break;
                case 6:
                    System.out.println("diện hình cn");
                    hinhChuNhat.caculateDienTich();
                    break;
                case 7:
                    System.out.println("Thoát................");
                    break;
                default:
                    System.err.println("Chọn lại......");
                    break;
            }
        }while(choose != 7);

    }
}
