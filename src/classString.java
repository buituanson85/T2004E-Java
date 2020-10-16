import java.util.Scanner;

//in ký tự thứ k trong chuỗi s

//public class classString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int k = sc.nextInt();
//        System.out.print(s.charAt(k - 1));
//    }
//}

//Cho xâu s và ký tự c được nhập từ bàn phím. Bạn hãy viết chương trình in ra số lần xuất hiện của ký tự c trong xâu s...

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        char c = sc.next().charAt(0);
//        int answer = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == c) {
//                answer ++;
//            }
//        }
//        System.out.print(answer);
//    }
//}

//Cho xâu s và ký tự c được nhập từ bàn phím, bạn hãy viết chương trình in ra vị trí đầu tiên mà ký tự c xuất hiện trong xâu s,
// nếu ký tự c không xuất hiện trong s thì in ra -1.

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        char c = sc.next().charAt(0);
//        int answer = -1;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == c) {
//                /*
//                 * Gọi lệnh break để dừng vòng lặp do đã tìm thấy vị trí đầu tiên mà ký tự c
//                 * xuất hiện. Nếu không có lệnh break thì kết quả của chương trình sẽ là vị trí
//                 * cuối cùng mà ký tự c xuất hiện.
//                 */
//                answer = i;
//                break;
//            }
//        }
//        System.out.print(answer);
//    }
//}

//Cho hai xâu ký tự s1 và s2 được nhập vào từ bàn phím,
// bạn hãy viết chương trình hiển thị ra vị trí đầu tiên mà s2 xuất hiện trong s1 (không phân biệt hoa thường).

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        String s2 = sc.next();
//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//        System.out.print(s1.indexOf(s2));
//    }
//}

//Cho xâu s được nhập vào từ bàn phím,
// bạn hãy viết chương trình hiển thị ra màn hình những ký tự không phải là số trong xâu s.

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        for(char c = '0'; c <= '9';c++) {
//            s = s.replace(c + "", "");
//        }
//        System.out.println(s);
//    }
//}

//Cho xâu s được nhập vào từ bàn phím, bạn hãy viết chương trình hiển thị ra màn hình số các ký tự in hoa trong xâu s.

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int answer = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
//                answer++;
//            }
//        }
//        System.out.print(answer);
//    }
//}

//Cho xâu s được nhập và từ bàn phím, bạn hãy viết chương trình đảo ngược xâu s và hiển thị ra màn hình.

//public class classString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        String answer = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            answer += s.charAt(i);
//        }
//        System.out.print(answer);
//    }
//}
