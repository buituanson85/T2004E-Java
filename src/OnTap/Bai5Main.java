package OnTap;

public class Bai5Main {
    public static void main(String[] args) {
        Bai5Car bai5Car = new Bai5Car();
        Bai5XeDap bai5XeDap = new Bai5XeDap();

        bai5Car.input();
        bai5XeDap.input();
        bai5Car.display();
        bai5XeDap.display();
        bai5Car.running();
        bai5XeDap.running();
    }
}
