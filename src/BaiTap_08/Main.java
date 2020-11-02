package BaiTap_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            MenuController.getInstance().showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    MenuController.getInstance().inputTeacher();
                    break;
                case 2:
                    MenuController.getInstance().inputStudent();
                    break;
                case 3:
                    MenuController.getInstance().inputSubject();
                    break;
                case 4:
                    MenuController.getInstance().inputClassRoom();
                    break;
                case 5:
                    MenuController.getInstance().inputClassGroop();
                    break;
                case 6:
                    MenuController.getInstance().inputSchedule();
                    break;
                case 7:
                    MenuController.getInstance().inputAttendence();
                    break;
                case 8:
                    System.err.println("thoát...........");
                    break;
                default:
                    System.err.println("Nhập sai");
                    break;
            }

        }while (choose !=8);
    }
}
