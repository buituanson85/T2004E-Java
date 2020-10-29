package BaiTap_02;

import java.util.Scanner;

public class Vehicle {
    String manufacturer;
    String carNo;
    String year;
    String owner;
    int width;
    int height;

    public Vehicle() {
    }

    public Vehicle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Vehicle(String manufacturer, String carNo, String year, String owner, int width, int height) {
        this.manufacturer = manufacturer;
        this.carNo = carNo;
        this.year = year;
        this.owner = owner;
        this.width = width;
        this.height = height;
    }

    public void Input(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Nhập nhà sản xuất: ");
        manufacturer = sc.nextLine();

        System.out.println("Nhập biển số xe: ");
        carNo = sc.nextLine();

        System.out.println("Nhập năm sản xuất: ");
        year = sc.nextLine();

        System.out.println("Nhập chiều rộng: ");
        width = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập chiều dài: ");
        height = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", carNo='" + carNo + '\'' +
                ", year='" + year + '\'' +
                ", owner='" + owner + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public void ShowInfo(){
        System.out.println(toString());
    }

    public int GetS(){
        return width * height;
    }


    //get && set
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
