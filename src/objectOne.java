import java.util.Scanner;

//Bạn hãy viết chương trình khai báo lớp Student với thông tin giống như sau:

//class Student{
//    String name;
//    int age;
//    public void getInformation() {
//        Scanner sc = new Scanner(System.in);
//        name = sc.next();
//        age = sc.nextInt();
//    }
//    public void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//}
//
//
//public class objectOne {
//    public static void main(String[]args) {
//        Student s1 = new Student();
//        s1.getInformation();
//        s1.display();
//    }
//}

/*Sử dụng phương pháp lập trình hướng đối tượng để giải quyết bài tập sau:

Bạn hãy viết chương trình nhập từ bàn phím chiều dài và chiều rộng của một hình chữ nhật và hiển thị ra màn hình:*/

//public class objectOne {
//    public static void main(String[]args) {
//        Rectangle r1 = new Rectangle();
//        r1.getInformation();
//        r1.display();
//    }
//}
//
//class Rectangle{
//    double length, width;
//    public void getInformation(){
//        Scanner sc = new Scanner(System.in);
//        length = sc.nextDouble();
//        width = sc.nextDouble();
//    }
//    public double getArea(){
//        return length * width;
//    }
//    public double getPerimeter(){
//        return (length + width) * 2;
//    }
//    public void display(){
//        System.out.println("Area: " + getArea());
//        System.out.println("Perimeter: " + getPerimeter());
//    }
//}

//public private

//class student {
//    private String name;
//    private int age;
//    public student() {
//        name = "Sơn";
//        age = 35;
//    }
//    public void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Tuổi: " + age);
//    }
//}
//
//public class objectOne {
//    public static void main(String[] args){
//        student s = new student();
//        s.display();
//    }
//}

//Constructor (phương thức khởi tạo) trong Java được chia làm 2 loại là constructor không tham số
// (như bài trên bạn đã học) và constructor có tham số.

//class Student {
//    String name;
//    int age;
//    public Student(String n,int a){
//        name = n;
//        age = a;
//    }
//    public void display(){
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//}
//
//public class Entry {
//    public static void main(String[] args) {
//        Student s1 = new Student("Long", 24);
//        Student s2 = new Student("Kien", 29);
//        s1.display();
//        s2.display();
//    }
//}

//this trong Constructor

//class Customer {
//    String name;
//    public Customer(){
//
//    }
//    public Customer(String name){
//        this.name = name;
//    }
//}
//
//public class objectOne {
//    public static void main(String[] args){
//        Customer customer = new Customer();
//        System.out.println("Welcom to FPT");
//    }
//}

//Tạo lớp

//public class objectOne {
//    private String name;
//    private int age;
//    private String gender;
//    private double gpa;
//
//    public objectOne(String name, int age, String gender, double gpa) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.gpa = gpa;
//    }
//
//    public void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Gender: " + gender);
//        System.out.println("GPA: " + gpa);
//    }
//}

//class Circle {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea() {
//        return 3.14 * radius * radius;
//    }
//
//    public double getCircumference() {
//        return 3.14 * 2 * radius;
//    }
//}

/*Bạn cần lưu ý rằng việc khai báo và sử dụng mảng các đối tượng không giống với khai báo và
 sử dụng mảng các kiểu dữ liệu nguyên thủy như int, double, String, ...

Để sử dụng được các phần tử trong mảng bạn cần phải khởi tạo cho từng phần tử. Ví dụ:*/

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class objectOne {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Tuan", 24);
        students[1] = new Student("Cuong", 25);
        students[2] = new Student("Duc", 24);
        for (int i = 0; i < 3; i++) {
            students[i].display();
        }
    }
}

//class Student {
//    String name;
//    int age;
//
//    public Student() {
//
//    }
//
//    public void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//}
//
//public class objectOne {
//    public static void main(String[] args) {
//        Student[] students = new Student[3];
//        for (int i = 0; i < 3; i++) {
//            students[i] = new Student();
//        }
//        students[0].name = "Tuan";
//        students[0].age = 24;
//        students[1].name = "Cuong";
//        students[1].age = 25;
//        students[2].name = "Duc";
//        students[2].age = 24;
//        for (int i = 0; i < 3; i++) {
//            students[i].display();
//        }
//    }
//}