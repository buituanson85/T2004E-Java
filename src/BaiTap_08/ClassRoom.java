package BaiTap_08;

import java.util.Scanner;

public class ClassRoom {
    private String classCode;
    private String className;

    public ClassRoom() {
    }

    public ClassRoom(String classCode, String className) {
        this.classCode = classCode;
        this.className = className;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classCode='" + classCode + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã Lớp học: ");
        classCode = sc.nextLine();

        System.out.println("Nhập tên lớp học: ");
        className = sc.nextLine();
    }
}
