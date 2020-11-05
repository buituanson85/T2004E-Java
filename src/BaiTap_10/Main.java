package BaiTap_10;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Account account = null;

    public static void main(String[] args) {
        login();
        System.out.println("Next step");
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    account = new Account();
                    account.input();
                    break;
                case 2:
                    if (account != null){
                        account.addReceiver();
                        account.display();
                    }else {
                        System.err.println("Lỗi tk ko tồn tại..........");
                    }
                    break;
                case 3:
                    if (account != null){
                        account.addTransfer();
                    }else {
                        System.err.println("Lỗi tk ko tồn tại..........");
                    }
                    break;
                case 4:
                    if (account != null){
                        account.displayReceiverHistory();
                    }else {
                        System.err.println("Lỗi tk ko tồn tại..........");
                    }
                    break;
                case 5:
                    if (account != null){
                        account.displayTransferHistory();
                    }else {
                        System.err.println("Lỗi tk ko tồn tại..........");
                    }
                    break;
                case 6:

                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("nhập lại....");
                    break;
            }
        }while (choose != 8);
    }

    static void showMenu(){
        System.out.println("1.Khởi tạo tài khoản");
        System.out.println("2.Nạp tiền");
        System.out.println("3.Chuyển khoản");
        System.out.println("4.Xem lịch sử chuyển tiền");
        System.out.println("6.Lưu ");
        System.out.println("7.ĐỌc dữ liệu");
        System.out.println("8.Thoát");
        System.out.println("Choose: ");
    }

    static void login(){
        System.out.println("========== Welcom ==========");
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập mật khẩu: ");
        String passworld = sc.nextLine();

        if (name.equalsIgnoreCase("bts") && passworld.equals("123456")){
            System.out.println("Đăng nhập thành công");
        }else {
            System.out.println("đăng nhập thất bại");
            login();
        }
    }
}
