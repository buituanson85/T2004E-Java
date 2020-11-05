package Practical_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ConversionUtil_2 {
    double fahrenheitToCelsius(double fDegree) {
        double celsius = (fDegree - 32) / 1.8;
        System.out.println(celsius);
        return celsius;
    }

    double celciusToFahrenheit(double cDegree) {
        double fahrenheit = (cDegree * 1.8) + 32;
        System.out.println(fahrenheit);
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Celcius To Fahrenheit");
            System.out.println("2.Fahrenheit To Celsius");
            System.out.println("3.String Tokenizer");
            System.out.println("4.Ẽxit");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Input Celcius :");
                    ConversionUtil_2 ch = new ConversionUtil_2();
                    double cel = Double.parseDouble(input.nextLine());
                    ch.celciusToFahrenheit(cel);
                    break;
                case 2:
                    System.out.println("Input Fahrenheit :");
                    ConversionUtil_2 chs = new ConversionUtil_2();
                    double fa = Double.parseDouble(input.nextLine());
                    chs.fahrenheitToCelsius(fa);
                    break;
                case 3:
                    System.out.println("Input a line :");
                    String line = input.nextLine();
                    StringTokenizer st1 = new StringTokenizer(line);
                    System.out.println("Token print :");
                    while (st1.hasMoreTokens()) {
                        System.out.println(st1.nextToken());
                    }
                    break;
                case 4:
                    return;

            }

        }

    }
}
