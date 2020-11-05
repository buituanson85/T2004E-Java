package Practical;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a line :");
        String line = sc.nextLine();
        StringTokenizer st1 = new StringTokenizer(line);
        System.out.println("Token print :");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
    }
}
