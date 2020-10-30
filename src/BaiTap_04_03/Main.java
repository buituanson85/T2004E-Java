package BaiTap_04_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử của mảng: ");
        n = Integer.parseInt(sc.nextLine());

        //Khai báo mảng
        Product [] productList = new Product[n];
        //Nhập thông tin n sản phẩm.
        for (int i = 0; i < n; i++){
            productList[i] = new Product();
            productList[i].Input();
        }

        //sản phẩm có giá cao nhất
        int indexMax = 0;
        for (int i = 0; i < n; i++){
            if (productList[i].getGia() > productList[indexMax].getGia()){
                indexMax = 1;
            }
        }

        //hiên thị thông tin có giá indexMax
        productList[indexMax].Display();
    }
}
