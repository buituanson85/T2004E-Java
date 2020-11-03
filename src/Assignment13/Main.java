package Assignment13;

public class Main {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        myPoint1.inputInfo();
        MyPoint myPoint2 = new MyPoint();
        myPoint2.inputInfo();
        System.out.println(myPoint1.distance(myPoint2));

        MyPoint p1=new MyPoint(3,0);
        MyPoint p2=new MyPoint(0,4);

// Kiểm thử việc tải chồng phương thứcdistance():
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5,6));
    }
}
