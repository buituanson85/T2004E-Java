package Assignment;

import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i%2 == 0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn từ 1 đến nhỏ hơn số vừa nhập = " + sum);
        int sum2 = 0;
        for (int i = 1; i < n; i++) {
            if (i%3 == 0){
                sum2 += i;
            }
        }
        System.out.println("Tổng các số chia hết cho 3 từ 1 đến nhỏ hơn số vừa nhập = " + sum2);
    }
}
