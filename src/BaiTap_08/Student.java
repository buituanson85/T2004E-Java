package BaiTap_08;

import java.util.Scanner;

public class Student extends Person {
    private String rollNo;

    public Student() {
    }

    public Student(String name, String gender, String address, String birthday, String rollNo) {
        super(name, gender, address, birthday);
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return super.toString() + ",rollNo= " + rollNo;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã sinh viên: ");
        rollNo = sc.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(toString());
    }
}
