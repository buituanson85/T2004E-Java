package BaiTap_08;

import java.util.Scanner;

public class Subject {
    private String subjectCode;
    private String subjectname;

    public Subject() {
    }

    public Subject(String subjectCode, String subjectname) {
        this.subjectCode = subjectCode;
        this.subjectname = subjectname;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectname='" + subjectname + '\'' +
                '}';
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã môn học: ");
        subjectCode = sc.nextLine();

        System.out.println("Nhập tên môn học: ");
        subjectname = sc.nextLine();
    }
}
