package Assignment5;

public class Result {

    public static void main(String[] args) {
        int[] arr = new int[255];
        Assignment5 As5 = new Assignment5();
        As5.InputInto(arr);
        System.out.println(Assignment5.Sum(arr));
        As5.Brand(arr);
        As5.Area(arr);
        As5.Share(arr);
    }
}

