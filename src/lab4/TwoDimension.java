package lab4;

public class TwoDimension {
    int marks[][];
    public void storeMarks(){
        marks = new int[4][2]; // line 2
        System.out.println("Storing Marks. Please wait...");
// Initialize array elements
        marks[0][0] = 23; // line 3
        marks[0][1] = 65;
        marks[1][0] = 42;
        marks[1][1] = 47;
        marks[2][0] = 60;
        marks[2][1] = 75;
        marks[3][0] = 75;
        marks[3][1] = 50;
    }
    /**
     * Displays marks from a two-dimensional array
     *
     * @return void
     */
    public void displayMarks(){
        System.out.println("Marks are:"); // Display the marks
        System.out.println("Roll no.1:" + marks[0][0]+ "," + marks[0][1]);
        System.out.println("Roll no.2:" + marks[1][0]+ "," + marks[1][1]);
        System.out.println("Roll no.3:" + marks[2][0]+ "," + marks[2][1]);
        System.out.println("Roll no.4:" + marks[3][0]+ "," + marks[3][1]);
        for (int i = 0 ; i < marks.length ; i++){
            for (int j = 0; j < marks[i].length ; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        TwoDimension twoDimenObj = new TwoDimension();
        twoDimenObj.storeMarks();
        twoDimenObj.displayMarks();
    }
}
