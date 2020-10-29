package lab7;

import java.time.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MathExample {
    public void divide(int n1, int n2){
        try {
            int t = n1/n2;
            System.out.println("KQ + " +t);
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        LocalDateTime datetime = LocalDateTime.of(2016, Month.FEBRUARY, 15,
//                18, 20);
//// to display the result using Offset
//        ZoneOffset sampleoffset = ZoneOffset.of("-07:00");
//        OffsetDateTime date = OffsetDateTime.of(datetime, sampleoffset);
//        System.out.println("Sample display of Date and Time using time-zone offset : " + date);

        int n1 = 0;
        int n2 = 0;
        while (true){
            try {
                n1 = Integer.parseInt(sc.nextLine());
                break;
            }catch (InputMismatchException e){
                System.out.println("Nhập số nguyên");
            }catch (Exception e){
                System.out.println("Nhập số nguyên");
            }
        }
         while (true){
             try {
                 n2 = Integer.parseInt(sc.nextLine());
                 break;
             }catch (InputMismatchException e){
                 System.out.println("Nhập số nguyên");
             }catch (Exception e){
                 System.out.println("Nhập số nguyên");
             }
         }

        MathExample m = new MathExample();
        m.divide(n1, n2);
    }
}
