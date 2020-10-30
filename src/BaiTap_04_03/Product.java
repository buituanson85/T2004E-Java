package BaiTap_04_03;

import java.util.Scanner;

public class Product {
    private String maHH;
    private String tenHH;
    private int soLuong;
    private float gia;

    public Product() {
    }

    public Product(String maHH, String tenHH, int soLuong, float gia) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maHH='" + maHH + '\'' +
                ", tenHH='" + tenHH + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã: ");
        maHH = sc.nextLine();

        System.out.println("Nhập Tên: ");
        tenHH = sc.nextLine();

        System.out.println("Nhập số lượng: ");
        soLuong = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập giá: ");
        gia = Float.parseFloat(sc.nextLine());
    }

    public void Display(){
        System.out.println(toString());
    }
}
