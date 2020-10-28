package Basic;

public class Test {
    public static void main(String[] args) {
        int [] arr = new int[100];
        int [] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        float [] arr2 = new float[10];
        String [] arr3 = new String[50];
        int [][] arr4 = new int[3][4];
        System.out.println("length = " + arr.length);
        System.out.println("length = " + arr1.length);
        for (int i = 0; i < arr1.length; i++){
//            System.out.println("arr1["+i+"]" + arr1[i]);
            System.out.printf("arr[%d] = %d ;", i, arr1[i]);
        }
    }
}
