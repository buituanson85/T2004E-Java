package OnTap;

import java.util.Scanner;

public abstract class Bai5Vehicle {
    String name;
    int soBx;

    public Bai5Vehicle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoBx() {
        return soBx;
    }

    public void setSoBx(int soBx) {
        this.soBx = soBx;
    }

    public Bai5Vehicle(String name, int soBx) {
        this.name = name;
        this.soBx = soBx;
    }

    @Override
    public String toString() {
        return "Bai5Vehicle{" +
                "name='" + name + '\'' +
                ", soBx=" + soBx +
                '}';
    }

    public abstract void running();
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập số bánh xe: ");
        soBx = Integer.parseInt(sc.nextLine());
    };
    public void display(){
        System.out.println(toString());
    };
}
