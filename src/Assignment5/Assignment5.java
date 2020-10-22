package Assignment5;

import java.util.Scanner;

public class Assignment5 {
    Scanner sc = new Scanner(System.in);
    int n,tich;
    int tong, hieu;
    float thuong;
    int arr[] = new int[n];
    public void InputInto(){
        //tạo hàm nhập vào số phần tử mảng
        do{
            System.out.println("Nhập vào số phần tử mảng n = ");
            n = sc.nextInt();
        }while( n < 0);
        //khởi tạo và cấp phát bộ nhớ cho mảng
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhập phần tử thứ: " + i);
            arr[i] = sc.nextInt();
        }
        //Mảng sau khi nhập
        System.out.print("Mảng sau khi nhập: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
    }
        //Hàm tính tổng
    public int Tong(int arr[], int n){
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }
        return tong;
    }
        //Hàm tính hiệu
        public int Hieu(int arr[], int n){
            int hieu = 0;
            for (int i = 0; i < n; i++) {
                hieu -= arr[i];
            }
            return hieu;
        }
    //Hàm tính tích
    public int Tich(int arr[], int n){
        int tich = 1;
        for (int i = 0; i < n; i++) {
            tich *= arr[i];
        }
        return tich;
    }
    //Hàm tính thương
    public float Thuong(int arr[], int n){
        float thuong = 1;
        for (int i = 0; i < n; i++) {
            thuong /= (float)arr[i];
        }
        return thuong;
    }
    public static void main(String[] args) {
        int n,tich;
        int tong, hieu = 0;
        float thuong;
        int arr[] = new int[100];
        Assignment5 As5 = new Assignment5();
        As5.InputInto();
        int tongs = As5.Tong(As5.arr, As5.n);
        System.out.println(tongs);
    }





}
