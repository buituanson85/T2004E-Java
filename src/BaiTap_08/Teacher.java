package BaiTap_08;

import java.util.Scanner;

public class Teacher extends Person {
    private String teacherCode;

    public Teacher() {
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("NHập mã giáo viên: ");
        teacherCode = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ",Teacher code: " + teacherCode;
    }
}
