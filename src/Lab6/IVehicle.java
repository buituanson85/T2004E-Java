package Lab6;

//cách tạo file interface chuột phải vào file back kít chọn new javaclass thay vì chọn class chọn interface
public interface IVehicle {
    public  static final String STAEDID = "LA-09";

    public void start();
    public void accelerate(int speed);
    public void brake();
    public void stop();
}
