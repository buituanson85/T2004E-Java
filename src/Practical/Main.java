package Practical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motor motor = new Motor();
        Car car = new Car();

        System.out.println("Please Input Motor name: ");
        String motorName = sc.nextLine();
        motor.setName(motorName);

        System.out.println("Please Input Car name: ");
        String carName = sc.nextLine();
        car.setName(carName);

        System.out.println(motor.getName() + " can move with maximum velocity is " + motor.moveMax() + " km/h");
        System.out.println(car.getName() + " can move with maximum velocity is " + car.moveMax() + " km/h");
    }
}
