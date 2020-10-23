package Assignment5;

import java.util.Scanner;

public class Assignment5 {
    Scanner sc = new Scanner(System.in);
    int n;
    //tạo hàm nhập và xuất mảng
    public void InputInto(int[] arr){
//        int n;
        //tạo hàm nhập vào số phần tử mảng
        do{
            System.out.println("Enter the number of array elements n = ");
            n = sc.nextInt();
        }while( n < 0);
        //khởi tạo và cấp phát bộ nhớ cho mảng
//        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Import elements: " + i);
            arr[i] = sc.nextInt();
        }
        //Mảng sau khi nhập
        System.out.print("Array after importing: ");
        System.out.println(" ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");
    }
        //Hàm tính tổng các phần tử trong mảng
    public static int Sum(int[] arr){
        System.out.println("The sum of the elements in the array:");
        int tong = 0;
        for (int j : arr) {
            tong += j;
        }
        return tong;
    }
    //Hàm tính hiệu của phần tử mảng đầu tiên với các phần tử còn lại trong mảng
    public void Brand(int[] arr){
        System.out.println("Subtract with n integers as input");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] - arr[0] + "\t");
        }
        System.out.println(" ");
    }
    //Hàm tính tích các phần tử mảng đầu tiên với các phần tử mảng còn lại trong mảng
    public void Area(int[] arr){
        System.out.println("Nhân với đầu vào là n số nguyên");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] * arr[0] + "\t");
        }
        System.out.println(" ");
    }
    //Hàm chia tích các phần tử mảng đầu tiên với các phần tử mảng còn lại trong mảng
    public void Share(int[] arr){
        System.out.println("Divided by n integers as input");
        for (int i = 0; i < n; i++) {
            System.out.print((float) arr[i] / arr[0] + "\t");
        }
        System.out.println(" ");
    }
}
