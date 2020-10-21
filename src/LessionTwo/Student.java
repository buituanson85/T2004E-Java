package LessionTwo;

import java.util.Scanner;

public class Student {
    private String studentName;
    private int age;
    private String tel;
    Student() { //Hàm khởi tạo không tham số có rất nhiều hàm khởi tạo
        studentName = "Tuấn SƠn";
        age = 35;
        tel = "0906240410";
    }
    //hàm khởi tạo có thể cùng tên
    Student(int vage){
        age = vage;
    }
    Student(String vname,String vtel){
        studentName = vname;
        tel = vtel;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap name: ");
        studentName = sc.nextLine();
        System.out.println("Nhap age: ");
        age = sc.nextInt();
        sc.nextLine(); // chỉnh lỗi sai sau nextInt  là next Line
        System.out.println("Nhap tel: ");
        tel = sc.nextLine();
    }
    void  display() {
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Tel: " + tel);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getTel() {
        return tel;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public static void main(String[] args) {
        Student st3 = new Student(20);
        st3.display();
        System.out.println("ST $$$$$$$$$$$$");
        Student st4 = new Student("SƠn", "060");
        st3 = st4;
        st3.age = 30;
        st3.tel = "99999";
        st3.display();
        System.out.println("ST $$$$$$$$$$$$");
        st4.display();
//        Student st1 = new Student();
//        st1.input();
//        st1.display();
//        Student st2 = new Student();
//        st2.input();
//        st2.display();

    }
}
