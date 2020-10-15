import java.util.Scanner;

public class classIf {
    // chẵn lẻ
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n % 2 == 0) {
//            System.out.println("n is an even number");
//        } else {
//            System.out.println("n is an odd number");
//        }

        //max min 3 số

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxx = a;
        if (b > maxx) {
            maxx = b;
        }
        if (c > maxx) {
            maxx = c;
        }
        System.out.println(maxx);
    }
    //số nguyên dương âm 0
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n == 0) {
//            System.out.println("n is equal to 0");
//        }
//        if (n < 0) {
//            System.out.println("n is a negative number");
//        }
//        if (n > 0) {
//            System.out.println("n is a positive number");
//        }
//    }
    //a>b
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a >= b) {
//            System.out.println("a is greater than or equal to b");
//        } else {
//            System.out.println("a is smaller than b");
//        }
//    }
}

// so sánh 2 chuỗi dùng  a.equals(b)

//public class Statement {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String b = sc.next();
//        if (a.equals(b)) {
//            System.out.println("two people have the same name");
//        } else {
//            System.out.println("two people don't have the same name");
//        }
//    }
//}

// kiểm tra giá trị a và b có khác 0 hay không

//public class Statement {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a != 0 && b != 0) {
//            System.out.println("a is not equal to 0 and b is not equal to 0");
//        } else {
//            System.out.println("a is equal to 0 or b is equal to 0");
//        }
//    }
//}

// kiểm tra xem a có nằm trong khoảng [10...100]

//public class Statement {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a >= 10 && a <= 100) {
//            System.out.println(a + " is in the range [10, 100]");
//        } else {
//            System.out.println(a + " is not in the range [10, 100]");
//        }
//
//    }
//}

//Viết chương trình nhập từ bàn phím 3 số nguyên a, b, c.
// Sau đó hãy kiểm tra xem a, b, c có tạo thành một dãy số tăng dần hoặc giảm dần hay không.

//nhập x,y kiểm tra tọa độ ở góc phần tư thứ mấy

//public class SelectionStatements {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        if ( x > 0 && y > 0 ) System.out.println("This point lies in the First quadrant");
//        else if (x < 0 && y > 0) System.out.println("This point lies in the Second quadrant");
//        else if (x < 0 && y < 0) System.out.println("This point lies in the Third quadrant");
//        else if (x > 0 && y < 0) System.out.println("This point lies in the Fourth quadrant");
//        else System.out.println("x, y must not equal to 0");
//    }
//}




