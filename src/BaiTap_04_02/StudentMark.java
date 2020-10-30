package BaiTap_04_02;

import java.util.Scanner;

public class StudentMark {
    String rollNo;
    String fullname;
    String className;
    String subject;
    float mark;

    public StudentMark() {
    }

    public StudentMark(String rollNo, String fullname, String className, String subject, float mark) {
        this.rollNo = rollNo;
        this.fullname = fullname;
        this.className = className;
        this.subject = subject;
        this.mark = mark;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "StudentMark{" +
                "rollNo='" + rollNo + '\'' +
                ", fullname='" + fullname + '\'' +
                ", className='" + className + '\'' +
                ", subject='" + subject + '\'' +
                ", mark=" + mark +
                '}';
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã : ");
        rollNo = sc.nextLine();

        System.out.println("Nhập Tên : ");
        fullname = sc.nextLine();

        System.out.println("Nhập Lớp : ");
        className = sc.nextLine();

        System.out.println("Nhập môn : ");
        subject = sc.nextLine();

        System.out.println("Nhập điểm : ");
        mark = Float.parseFloat(sc.nextLine());
    }

    public void Display(){
        System.out.println(toString());
    }

    public static void main(String[] args) {
        StudentMark studentMark = new StudentMark();
        studentMark.Input();

        StudentMark studentMark1 = new StudentMark("001", "SƠn", "T2004E", "Java 1", 8);
        studentMark.Display();
        studentMark1.Display();
        System.out.println("Hiển thị có điểm cao nhất");
        if (studentMark.getMark() > studentMark1.getMark()){
            studentMark.Display();
        }else {
            studentMark1.Display();
        }
    }
}
