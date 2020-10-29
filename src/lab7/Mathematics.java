package lab7;

public class Mathematics {
    public void divide(int num1, int num2){
        try{
            System.out.println("Division is: " + (num1/num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
