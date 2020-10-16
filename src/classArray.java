import java.util.Scanner;

//public class classArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] a = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//}

//Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím.
// Bạn hãy viết chương trình hiển thị ra phần tử lớn nhất trong mảng

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int maxValue = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > maxValue) {
//                maxValue = arr[i];
//            }
//        }
//
//        System.out.print(maxValue);
//    }
//}

// viết chương trình hiển thị ra tổng của phần tử đầu tiên và cuối cùng trong mảng arr.

//public class classArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print(arr[0] + arr[n - 1]);
//    }
//}

// Bạn hãy viết chương trình hiển thị ra màn hình những số chẵn trong mảng

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0;i<n;i++) {
//            if(arr[i] % 2 == 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}

//Cho một mảng các số nguyên n phần tử arr và số nguyên k được nhập từ bàn phím.
// Bạn hãy viết chương trình hiển thị ra màn hình số phần tử có giá trị bằng k trong mảng arr.

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//
//        int count = 0;
//        for(int i=0;i<n;i++) {
//            if(arr[i] == k) {
//                count++;
//            }
//        }
//        System.out.print(count);
//    }
//}

// Bạn hãy viết chương trình tính tổng các số lẻ lớn hơn 0 trong mảng.

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int answer = 0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i] % 2 != 0 && arr[i] > 0) {
//                answer += arr[i];
//            }
//        }
//        System.out.print(answer);
//    }
//}

//Bạn hãy viết chương trình hiển thị những số lớn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10 trong mảng arr.

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] >= 0 && arr[i] <= 10) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}

//Bạn hãy viết chương trình sắp xếp các phần tử của mảng theo thứ tự tăng dần và hiển thị ra màn hình mảng sau khi đã sắp xếp.

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] > arr[j]) {
//                    // Nếu arr[i] > arr[j] thì hoán đổi giá trị của arr[i] và arr[j]
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

//Cho một mảng 2 chiều các số nguyên n hàng m cột arr được nhập từ bàn phím.
// Bạn hãy viết chương trình tính tổng các phần tử trong mảng arr.

//public class classArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] arr = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int answer = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                answer += arr[i][j];
//            }
//        }
//
//        System.out.print(answer);
//    }
//}

//Cho một mảng 2 chiều các số nguyên n hàng m cột arr được nhập từ bàn phím.
// Bạn hãy viết chương trình tính tổng các phần tử chia hết cho 5 trong arr.

//public class Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] arr = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int answer = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] % 5 == 0) {
//                    answer += arr[i][j];
//                }
//            }
//        }
//        System.out.print(answer);
//    }
//}

