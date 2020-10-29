package Manager.Cat;

import java.util.Scanner;

public class UsingManagerCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerCat managerCat = new ManagerCat();
        ColorManager colorManager = new ColorManager();
        int choose;

        do {
            ShowMenu();
            choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 0:
                    colorManager.Input();
                    break;
                case 1:
                    managerCat.Input(colorManager);
                    break;
                case 2:
                    managerCat.Display();
                    break;
                case 3:
                    managerCat.Sort();
                    break;
                case 4:
                    managerCat.Find();
                    break;
                case 5:
                    managerCat.SortByColor();
                    break;
                case 6:
                    System.out.println("Thoat............");
                    break;
                default:
                    System.err.println("Nhập sai...");
                    break;
            }
        }while (choose != 6);
    }

    static void ShowMenu(){
        System.out.println("0.Nhập danh sách mã màu");
        System.out.println("1.Nhập thông tin của n con mèo");
        System.out.println("2. Hiển thị thông tin");
        System.out.println("3.Sắp xếp danh sách theo mau");
        System.out.println("4.Tìm kiếm thông tin theo loai");
        System.out.println("5.Sắp xếp danh sách màu theo bảng màu trong lớp ColorManager");
        System.out.println("6.Thoát");
        System.out.println("Choose");
    }
}
