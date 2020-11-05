package BaiTap_10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Receiver {
    int money; //số tiền thêm vào
    String note;
    Date createdAt;

    public Receiver() {
    }

    public Receiver(int money, String note, Date createdAt) {
        this.money = money;
        this.note = note;
        this.createdAt = createdAt;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void input(){
        System.out.println("Nhập thông tin chuyển tiền: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("số tiền cần nạp: ");
        money = Integer.parseInt(sc.nextLine());

        System.out.println("Nội dung: ");
        note = sc.nextLine();

        createdAt = new Date();
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "money=" + money +
                ", note='" + note + '\'' +
                ", createdAt=" + getCreatedAtString() +
                '}';
    }

    public String getCreatedAtString(){
        SimpleDateFormat format = new SimpleDateFormat("h:m:s  dd/MM/yyyy");
        String str = format.format(createdAt);
        return str;
    }
    public void display(){
        System.out.println(toString());
    }
}
