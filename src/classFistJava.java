import java.util.Scanner;

public class classFistJava {
    public static void main(String[] args) {
        // Tạo ra đối tượng sc thuộc lớp Scanner để nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        double gpa = sc.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade Point Average: " + gpa);

        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        System.out.println("a + b = " + (a + b));

        Scanner sc2 = new Scanner(System.in);
        int length = sc2.nextInt();
        int width = sc2.nextInt();
        System.out.println("Area = " + (length * width));

        //toán tử

        Scanner sc4 = new Scanner(System.in);
        int a2 = sc4.nextInt();
        int b2 = sc4.nextInt();
        System.out.println("a % b = " + (a2 % b2));

        Scanner sc5 = new Scanner(System.in);
        int a3 = sc5.nextInt();
        int b3 = sc5.nextInt();
        System.out.println("a + b = " + (a3 + b3));
        System.out.println("a - b = " + (a3 - b3));
        System.out.println("a * b = " + (a3 * b3));
        System.out.println("a / b = " + (a3 / b3));
        System.out.println("a % b = " + (a3 % b3));

        Scanner sc6 = new Scanner(System.in);
        String name6 = sc6.next();
        int age6 = sc6.nextInt();
        System.out.println("In 15 years, age of " + name6 + " will be " + (age6 + 15));

        /*Hoán đổi 2 số a và b
        * Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("after swapping, a = " + a + ", b = " + b);
        * */

        /*Lớp Scanner không cung cấp phương thức để nhập dữ liệu cho biến kiểu char,
         thay vào đó bạn phải nhập dữ liệu cho kiểu String và lấy ra ký tự đầu tiên trong String đó. Ví dụ:
         public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		System.out.println("c = " + c);
	}
}
nhập a và b kiểm tra a với b nếu a>b true sai false
public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a > b);
	}
}
*/
    }
}
