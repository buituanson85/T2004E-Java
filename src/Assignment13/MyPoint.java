package Assignment13;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tạo độ x: ");
        x = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tạo độ y: ");
        y = Integer.parseInt(sc.nextLine());
    }
    //Phương thức Setxy

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    //tótring

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //hàm distance
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
