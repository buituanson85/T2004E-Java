package lab4;

public class OneDimension {
    int marks [];
    public void storeMarks(){
        marks =new int[4];
        System.out.println("Storing marks. please wait...");
        marks[0] = 65;
        marks[1] = 47;
        marks[2] = 75;
        marks[3] = 50;
    }

    public void display(){
        System.out.println(marks[0]);

        for (int i = 0; i< marks.length ; i++){
            System.out.println(marks[i]);
        }
    }

    public static void main(String[] args) {
        OneDimension one = new OneDimension();
        one.storeMarks();
        one.display();
    }
}
