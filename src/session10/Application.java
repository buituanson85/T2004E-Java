package session10;

public class Application {
    public static void main(String[] args) {
        FourWheeler fw = new FourWheeler();
        fw.accelerate(100);
        fw.showDetail();
        FourWheeler fw2 = new FourWheeler("No", "Name", 4, true);
        Vehicle v = new Vehicle();
        v.accelerate(200);
    }
}
