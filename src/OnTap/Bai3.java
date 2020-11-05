package OnTap;

import java.util.Scanner;

public class Bai3 {
    String tenS;
    String tenTg;
    String nsx;
    String nxb;

    public Bai3() {
    }

    public Bai3(String tenS, String tenTg, String nsx, String nxb) {
        this.tenS = tenS;
        this.tenTg = tenTg;
        this.nsx = nsx;
        this.nxb = nxb;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public String getTenTg() {
        return tenTg;
    }

    public void setTenTg(String tenTg) {
        this.tenTg = tenTg;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên sách: ");
        tenS = sc.nextLine();

        System.out.println("Nhập tên tác giả: ");
        tenTg = sc.nextLine();

        System.out.println("Nhập nhà xuất bản: ");
        nxb = sc.nextLine();

        System.out.println("Nhập năm sản xuất: ");
        nsx = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Bai3_book{" +
                "tenS='" + tenS + '\'' +
                ", tenTg='" + tenTg + '\'' +
                ", nsx='" + nsx + '\'' +
                ", nxb='" + nxb + '\'' +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
}
