package lab2;

public class LoopTest {
    public static void main(String[] args) {
        int num =1;
        int product =1;
        while (num <= 5){
            product = num*10;
            System.out.println("Product = " + product);
            num++;
        }
    }
}
