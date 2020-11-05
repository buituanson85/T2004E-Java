package BaiTap_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    String name, stk, phoneNumber, address;
    int monney;
    List<Receiver> receiversList = new ArrayList<>();
    List<Transfer> transferList = new ArrayList<>();

    public Account(String name, String stk, String phoneNumber, String address, int monney) {
        this.name = name;
        this.stk = stk;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.monney = monney;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMonney() {
        return monney;
    }

    public void setMonney(int monney) {
        this.monney = monney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", stk='" + stk + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", monney=" + monney +
                '}';
    }
    public void display(){
        System.out.println(toString());

        displayReceiverHistory();
        displayTransferHistory();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        name = sc.nextLine();

        System.out.println("số tk: ");
        stk = sc.nextLine();

        System.out.println("Nhập sđt: ");
        phoneNumber = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();

        monney = 0;
    }

    public void addReceiver(){
        Receiver receiver = new Receiver();
        receiver.input();

        receiversList.add(receiver);
        //công tiền vào tk

        monney += receiver.getMoney();
    }

    public void addTransfer(){
        Transfer transfer = new Transfer();
        transfer.input(monney);

        transferList.add(transfer);
        //công tiền vào tk

        monney -= transfer.getMoney();
    }

    public void displayReceiverHistory(){
        System.out.println("Lịch sử nhân tiền");
        for (Receiver receiver : receiversList){
            receiver.display();
        }
    }

    public void displayTransferHistory(){
        System.out.println("Lịch sử chuyển tiền");
        for (Transfer transfer : transferList){
            transfer.display();
        }
    }

}
