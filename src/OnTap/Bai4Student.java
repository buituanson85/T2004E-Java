package OnTap;

import Stud2.Student;

import java.util.Scanner;

public class Bai4Student extends Bai4People {
    String rollNo;

    public Bai4Student() {
    }

    public Bai4Student(String name, String address, String rollNo) {
        super(name, address);
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sv: ");
        rollNo = sc.nextLine();
    }
    @Override
    public String toString(){
        return super.toString() + ",rollNo " + rollNo;
    }
    @Override
    public void display(){
        System.out.println(toString());
    }

    public static void main(String[] args) {
        Bai4Student std = new Bai4Student();
        std.input();
        std.display();
    }

}
