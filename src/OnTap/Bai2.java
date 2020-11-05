package OnTap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Insert N = ");
        int n= Integer.parseInt(input.nextLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Mang so "+i+": ");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.print("so chia het cho 2: ");
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
