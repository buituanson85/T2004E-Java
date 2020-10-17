package Assignment;

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        float n,m;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào số thứ nhất: ");
        n = sc.nextFloat();
        System.out.print("Mời bạn nhập vào số thứ Hai: ");
        m = sc.nextFloat();
        System.out.print("Mời bạn chọn phép tính(+,-,*,/): ");
        choice = sc.next().charAt(0);
        switch (choice){
            case '+':
                System.out.println("Kết quả phép tính cộng = " + (n + m));
                break;
            case '-':
                System.out.println("Kết quả phép tính Trừ =" + (n - m));
                break;
            case '*':
                System.out.println("Kết quả phép tính Nhân =" + (n * m));
                break;
            case '/':
                System.out.println("Kết quả phép tính Chia =" + (n / m));
                break;
            default:
                System.out.println("Bạn nhập sai mời nhập lại");
                break;
        }
    }
}
