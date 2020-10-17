package Assignment;

import java.util.Scanner;

public class Assingment_2 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số thứ nhất: ");
        n = sc.nextInt();
        System.out.println("Mời bạn nhập vào số thứ Hai: ");
        m = sc.nextInt();
        System.out.println("Kết quả của bạn như sau");
        System.out.println("Kết quả phép tính cộng = " + (n + m));
        System.out.println("Kết quả phép tính cộng =" + (n - m));
        System.out.println("Kết quả phép tính cộng =" + (n * m));
        System.out.println("Kết quả phép tính cộng =" + ((float)n / m));
    }
}
