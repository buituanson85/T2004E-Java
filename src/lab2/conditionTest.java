package lab2;

public class conditionTest {
    public  static void main(String[] args){
        int first = 400, second = 700, result;
        result = first + second;
        if (result > 1000){
            second += 100;
        }else {
            second -= 100;
        }
        System.out.println("The value of second is " + second);
        int choice = 1;
        switch (choice) {
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Subtraction");
                break;
            case 3:
                System.out.println("Multiplication");
                break;
            default:
                System.out.println("Stop");
                break;
        }

    }
}
