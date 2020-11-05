package Practical_1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        double fahrenheit, cecius;
        ConversionUtil cvu = new ConversionUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + " độ F = " + cvu.fahrenheitToCelcius(fahrenheit) + " độ C");
        System.out.println("Nhập Celcius: ");
        cecius = scanner.nextDouble();
        System.out.println(cecius + " độ C = " + cvu.celciusToFahrenheit(cecius) + " độ F");
    }
}
