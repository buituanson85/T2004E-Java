package BaiTap_08;

import java.util.Scanner;

public class ClassGroup {
    private String classCode;
    private String rollNo;

    public ClassGroup() {
    }

    public ClassGroup(String classCode, String rollNo) {
        this.classCode = classCode;
        this.rollNo = rollNo;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "ClassGroup{" +
                "classCode='" + classCode + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã lớp: ");
        classCode = sc.nextLine();

        System.out.println("mã sinh viên: ");
        rollNo = sc.nextLine();
    }
}
