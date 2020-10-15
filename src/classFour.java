import java.util.Scanner;

public class classFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

//nhập a,b hiển thị số nguyên từ a đến b

//public class Loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = a; i <= b; i++) {
//            System.out.print(i + " ");
//        }
//    }
//}

// viết chương trình nhập vào từ bàn phím số nguyên n và thực hiện hiển thị các số từ n về -n.

//public class Loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = n; i >= -n; i--) {
//            System.out.print(i + " ");
//        }
//    }
//}

//viết chương trình nhập vào từ bàn phím số nguyên a và b. Sau đó hiển thị ra màn hình tổng các số từ a tới b:

//public class Loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int answer = 0;
//        for (int i = a; i <= b; i++) {
//            // answer += i tương đương với answer = answer + i
//            answer += i;
//        }
//        System.out.println(answer);
//    }
//}

//viết chương trình nhập vào từ bàn phím số nguyên n và thực hiện hiển thị ra tổng các số lẻ từ 0 tới n.

//public class Loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int answer = 0;
//        for (int i = 0; i <= n; i++) {
//            if (i % 2 != 0) {
//                answer += i;
//            }
//        }
//        System.out.println(answer);
//    }
//}

//chương trình nhập vào từ bàn phím số nguyên a và b. Sau đó hiển thị ra màn hình các số chia hết cho 3 từ a tới b:

//public class Loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = a; i <= b; i++) {
//            if (i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}

//viết chương trình nhập từ bàn phím số nguyên n và hiển thị ra màn hình n! (n giai thừa).

//public class Loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int answer = 1;
//        for (int i = 1; i <= n; i++) {
//            // answer *= i tương đương với answer = answer * i;
//            answer *= i;
//        }
//        System.out.print(answer);
//    }
//}

//viết chương trình nhập từ bàn phím một số nguyên n và hiển thị ra màn hình các ước của n (n > 0).

//public class Loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}

//viết chương trình hiển thị ra màn hình các số từ 0 tới 24
//            0 1 2 3 4
//            5 6 7 8 9
//            10 11 12 13 14
//            15 16 17 18 19
//            20 21 22 23 24

//public class Loop {
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(count + " ");
//                count += 1;
//            }
//            System.out.println();
//        }
//    }
//}



