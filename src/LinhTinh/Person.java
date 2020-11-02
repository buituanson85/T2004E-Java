package LinhTinh;

import java.util.Scanner;

public abstract class Person implements IElectricity {
    final int price = 1500;
    final int quota = 100;
    private int id; //mã khách hàng
    private String name;
    private String date;//ngày ra hóa đơn
    private String type;//đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất)
    private float kw; //số lượng điện tiêu thụ
    private String phone;//phoneNumber
    private double wallet;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getKw() {
        return kw;
    }

    public void setKw(float kw) {
        this.kw = kw;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getWallet() {
        return wallet;
    }

    //Tạo hàm nhập thông tin khách hàng.

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the customer id: ");
            id = sc.nextInt();

        System.out.println("Enter the customer name: ");
            name = sc.nextLine();

        System.out.println("Enter the invoice date: ");
            date = sc.nextLine();

        System.out.println("Enter the customer audience: ");
            type = sc.nextLine();

        System.out.println("Enter the electricity consumed: ");
            kw = sc.nextFloat();
        System.out.println("Enter your phone number: ");
            phone = sc.nextLine();

        System.out.println("The amount in the account: ");
        wallet = sc.nextDouble();
    }

    //Tạo hàm hiển thị
    public void display(){
        System.out.printf("%-15d %-15s %-15s %-15s %-15f %-15s %-15f", id, name, type, date, kw, phone, wallet);
    }

    public void displayPay(){

    }
}
