package BaiTap_10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transfer {
    String transferStk, note;
    int money;
    Date createdAt;

    public Transfer() {
    }

    public String getTransferStk() {
        return transferStk;
    }

    public void setTransferStk(String transferStk) {
        this.transferStk = transferStk;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void input(int maxMOnney){
        System.out.println("Nhập thông tin chuyển tiền: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("số tk cần chuyển: ");
        transferStk = sc.nextLine();

        for ( ; ; ){
            System.out.println("số tiền cần chuyển: ");
            money = Integer.parseInt(sc.nextLine());

            if (money >= maxMOnney){
                break;
            }
            System.err.println("số tiền ko đủ");
        }

        System.out.println("Nội dung: ");
        note = sc.nextLine();

        createdAt = new Date();
    }

    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "transferStk=" + transferStk +
                ", note='" + note + '\'' +
                ", createdAt=" + getCreatedAtString() +
                '}';
    }

    public String getCreatedAtString(){
        SimpleDateFormat format = new SimpleDateFormat("h:m:s  dd/MM/yyyy");
        String str = format.format(createdAt);
        return str;
    }
}
