package BaiTap_07;

import java.util.Scanner;

public class Program {
    static void show(){
        System.out.println("1.Chuyen trang thai (switch)");
        System.out.println("2. Chuyen trang thai kem theo kenh");
        System.out.println("3.Bat tivi");
        System.out.println("4.Tat tivi");
        System.out.println("5.Chuyen kenh tiep");
        System.out.println("6. Chuyen kenh truoc");
        System.out.println("7.Xem thong tin Tivi");
        System.out.println("8.Thoát");

    }
    public static void main(String[] args) {
        CTivi cTivi;
        int choose;
        Scanner sc = new Scanner(System.in);

        System.out.println("Lựa chọn cách khởi tạo TV");
        System.out.println("1.Mặc ĐỊnh");
        System.out.println("2.Lựa chọn kênh");
        System.out.println("choose: ");
        choose = Integer.parseInt(sc.nextLine());
        if (choose == 1){
            cTivi = new CTivi();
        }else {
            System.out.println("Nhap số kênh");
            int n = Integer.parseInt(sc.nextLine());
            String [] channel = new String[n];
            for (int i = 0; i < n; i++){
                System.out.println("NHap kênh thú mấy: " + (i+1));
                channel[i] = sc.nextLine();
            }
            cTivi = new CTivi(channel);
        }
        do {
            show();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    cTivi.Swich();
                    break;
                case 2:
                    System.out.println("Nhập kênh cần chuyển");
                    String setChannel = sc.nextLine();
                    break;
                case 3:
                    cTivi.On();
                    break;
                case 4:
                    cTivi.Off();
                    break;
                case 5:
                    cTivi.nextChannel();
                    break;
                case 6:
                    cTivi.previousChannel();
                    break;
                case 7:
                    cTivi.show();
                    break;
                case 8:
                    System.out.println("THoat..........");
                    break;
                default:
                    System.out.println("CHọn lại........");
                    break;
            }
        }while (choose != 8);
    }
}
