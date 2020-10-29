package BaiTap_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PeopleMrg peopleMrg = new PeopleMrg();
        Zone zone = new Zone();
        int choose;
        Scanner sc =new Scanner(System.in);

        do {
            ShowMenu();
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    peopleMrg.Input();
                    break;
                case 2:
                    zone.Input();
                    break;
                case 3:
                    zone.InputVehicle();
                    break;
                case 4:
                    zone.Sort();
                    break;
                case 5:
                    zone.ShowInfo();
                    break;
                case 6:
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("nhập sai");
                    break;
            }
        }while (choose != 7);
    }

    static void ShowMenu(){
        System.out.println("1.Nhập thông tin cho n người: ");
        System.out.println("2.Nhập thông tin cho n khu vực: ");
        System.out.println("3.Nhập thông tin cho n Vehicle và tự động tìm kiếm khu vực phù hợp: ");
        System.out.println("4.Hiển thị thông tin sở hữu xe cộ một người theo tên: ");
        System.out.println("5.Dùng giải thuật sắp xếp theo thứ tự giảm dần theo diện tích xe từng khu vực: ");
        System.out.println("6. Sử dụng kết quả 5 hiển thị thông tin xe cộ trong Zone đó: ");
        System.out.println("7. Thoát....");
        System.out.println("Choose: ");
    }
}
