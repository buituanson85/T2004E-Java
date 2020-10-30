package BaiTap_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Car implements ICar {
    private String name;
    private String producer;
    private String year;
    private int seat;
    private float rootPrice;

    public Car() {
    }

    public Car(String name, String producer, String year, int seat, float rootPrice) {
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.rootPrice = rootPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public float getRootPrice() {
        return rootPrice;
    }

    public void setRootPrice(float rootPrice) {
        this.rootPrice = rootPrice;
    }

    @Override
    public float caculateTax() {
        if (seat < 7){
            return rootPrice * 0.6f;
        }
        return 0.7f;
    }

    @Override
    public float caculatePrice() {
        return rootPrice + caculateTax();
    }

    @Override
    public void getInfo() {
        System.out.printf("%s car produced by %s in %s has %d seats with the total price is %f",
                name, producer, year, seat, caculatePrice());
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập Tên: ");
        name = sc.nextLine();

        System.out.println("Nhập nhà sản xuất: ");
        producer = sc.nextLine();

        System.out.println("Nhập năm sx: ");
        year = sc.nextLine();

        System.out.println("Nhập số ghế: ");
        try {
            seat = Integer.parseInt(sc.nextLine());
        }catch (InputMismatchException e){
            System.out.println("Nhập số nguyên");
        }catch (Exception e){
            System.out.println("Nhập số nguyên");
        }finally {

        }

        System.out.println("Nhập số giá: ");
        try {
            rootPrice = Float.parseFloat(sc.nextLine());;
        }catch (InputMismatchException e){
            System.out.println("Nhập số thực");
        }catch (Exception e){
            System.out.println("Nhập số thực");
        }finally {

        }

    }
}
