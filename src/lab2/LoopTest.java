package lab2;

import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
//        int num =1;
//        int product =1;
//        while (num <= 5){
//            product = num*10;
//            System.out.println("Product = " + product);
//            num++;
//        }
//        System.out.println("End while");
//        do{
//            product = num*10;
//            System.out.println("Product = " + product);
//            num++;
//        }while(num <= 10 );
//        System.out.println("End Do while");
//
//        for (int i = 0; i<= 5 ; i++){
//            product = i*10;
//            System.out.println("Product = " + product);
//        }
//        System.out.println("End For");
//        String line = "*";
//        for (int i = 1; i <= 9 ; i++){
//            System.out.println(line + " ");
//            line += "*" + " ";
//        }
        int n;
        System.out.println("Nhập n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextByte();
        System.out.println("End test one");
        for (int i= 0 ; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" " + "*");
            }
            System.out.println(" ");
        }
    }
}
