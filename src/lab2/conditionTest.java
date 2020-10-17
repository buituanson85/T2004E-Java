package lab2;

public class conditionTest {
    public  static void main(String[] args){
        int first = 400, second = 700, result;
        result = first + second;
        if (result > 1000){
            second += 100;
        }
        System.out.println("The value of second is " + second);
    }
}
