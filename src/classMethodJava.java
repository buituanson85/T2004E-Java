import java.util.Scanner;

//public class classMethodJava {
//    public static void show() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        show();
//        show();
//        show();
//    }
//}

//Bạn hãy viết phương thức trả về tổng của các phần tử trong mảng các số nguyên arr được nhập vào từ bàn phím.

//public class classMethodJava {
//    public static int sumOfArray(int[] arr) {
//        int answer = 0;
//        for (int i = 0; i < arr.length; i++) {
//            answer += arr[i];
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print(sumOfArray(arr));
//    }
//}

//Bạn hãy viết phương thức hiển thị ra màn hình các số chia hết cho 3 mà không chia hết cho 5
// trong mảng các số nguyên arr được nhập vào từ bàn phím.

//public class Method {
//    public static void show(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        show(arr);
//    }
//}

//Bạn hãy viết phương thức hiển thị ra màn hình những xâu có độ dài lớn hơn 3 trong mảng arr.

//public class Method {
//    public static void show(String[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() > 3) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.next();
//        }
//        show(arr);
//    }
//}

//Bạn hãy viết phương thức trả về số lớn nhất trong 3 số được nhập và từ bàn phím.

//public class Method {
//    public static int max3(int a, int b, int c) {
//        if(a >= b && a >= c) {
//            return a;
//        }
//        if(b >= c) {
//            return b;
//        }
//        return c;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        System.out.print(max3(a, b, c));
//    }
//}

//tính chu vi hình tròn

//public class Method {
//    public static double circumference(double r) {
//        return 2 * r * 3.14;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double r = sc.nextDouble();
//        System.out.print(circumference(r));
//    }
//}

//Cho số nguyên dương n được nhập từ bàn phím, bạn hãy viết phương thức đệ quy trả về n! (n giai thừa).

import java.util.Scanner;

//public class Method {
//    public static int factorial(int n) {
//        if (n == 1) return 1;
//        return n * factorial(n - 1);
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print(factorial(n));
//    }
//}

//Cho số nguyên n được nhập từ bàn phím, bạn hãy viết phương thức đệ quy trả về tổng các số lẻ từ 1 tới n.

//public class classMethodJava {
//    public static int sum(int n) {
//        if (n == 1) return 1;
//        if (n % 2 == 0) {
//            return sum(n - 1);
//        } else {
//            return n + sum(n - 1);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print(sum(n));
//    }
//}

//Cho mảng các số nguyên n phần tử arr được nhập từ bàn phím. Bạn hãy viết phương thức đệ quy tính tổng các phần tử của mảng.

//public class Method {
//    public static int sumOfArray(int[] arr, int n) {
//        if (n == 1) return arr[0];
//        return arr[n - 1] + sumOfArray(arr, n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print(sumOfArray(arr, n));
//    }
//}