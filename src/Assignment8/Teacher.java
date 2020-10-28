package Assignment8;

import java.util.Scanner;

public class Teacher extends  Persion {
    private String level;
    public Teacher(String name, String address, String tel,String level){
        super(name, address, tel);
        this.level = level;
    }

    public Teacher() {

    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void Display() {
        Scanner sc = new Scanner(System.in);
        super.Display();
        System.out.println("Nhập trình độ giáo viên: ");
        level = sc.nextLine();
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("%s", level);
    }
}
