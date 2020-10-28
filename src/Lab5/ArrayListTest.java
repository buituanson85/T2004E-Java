package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
    ArrayList marks = new ArrayList();

    public void storeMarks(){
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
    }

    public <Inrator> void showMarks(){
        for (int i = 0; i< marks.size(); i++){
            System.out.println("Values: " + marks.get(i));
        }

        Iterator it = marks.iterator();
        while (it.hasNext()){
            System.out.println("Values : " + it.next());
        }

        Collections.sort(marks);
        System.out.println(marks);
    }

    public static void main(String[] args) {

        ArrayListTest test = new ArrayListTest();
        test.storeMarks();
        test.showMarks();
    }
}
