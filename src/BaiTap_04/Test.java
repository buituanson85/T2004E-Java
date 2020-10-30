package BaiTap_04;

public class Test {
    public static void main(String[] args) {
        //Hàm tạo không đối
        Employee employee = new Employee();
        employee.Input();
        //có đối số

        Employee employee1 = new Employee("Sơn", "Nam", "Xã Đàn", "Nhân Viên", 500);
        //Hiển thị.
        employee.Display();
        employee1.Display();
    }
}
