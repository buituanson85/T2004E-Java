package Assignment8;

import java.util.Scanner;

public class Student extends Persion {
    private int id;

    public Student(String name, String address, String tel, int id){
        super(name, address, tel);
        this.id = id;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void Display() {
        Scanner sc = new Scanner(System.in);
        super.Display();
        System.out.println("Nhập mã sinh viên: ");
        id = sc.nextInt();
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("%d", id);
    }
}
