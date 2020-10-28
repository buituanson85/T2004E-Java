package asbtractdemo;

public class Circle extends Caculator {
    float radius;

    @Override
    public void Caculator() {
        float area = getPI()*getPI()*radius;
        System.out.println(area);
    }
}
