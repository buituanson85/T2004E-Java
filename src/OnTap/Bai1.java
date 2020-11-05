package OnTap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n = ");
        int n = Integer.parseInt(sc.nextLine());
        int total = 0;
        for (int i = 0; i < n; i++){
            total += i;
        }
        System.out.println(total);
    }
}
