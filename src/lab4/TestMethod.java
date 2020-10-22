package lab4;

import LessionThree.Employee;

public class TestMethod {
    public  void add(int n1, int n2){
        int tong = n1 + n2;
        System.out.println("Tong: " + tong);
    }

    public int add2(int n1, int n2){
        int tong = n1 + n2;
        return tong;
    }

    public void setNumber(int n1){
        System.out.println("Bắt đầu: " + n1);
        n1 = 100;
        System.out.println("Bắt đầu: " + n1);
    }

    public  void setTenNhanVien(Employee employee){
        employee.setName("Ten Moi");
    }

    public void addNumber(int...num){
        int sum = 0 ;
        for (int i:num){
            sum += i;
        }
        System.out.println("Sum of number is: " + sum);
    }
    public static void main(String[] args) {
        TestMethod t= new TestMethod();
        t.addNumber(5, 2, 3, 5);
//        t.add(10, 20);
//
//        int tg = t.add2(10, 20);
//        System.out.println("tg: " + tg);

//        int n1 = 10;
//        t.setNumber(n1);
//        System.out.println("n1= : " + n1);
//
//        Employee employee = new Employee();
//        employee.setName("Bùi Oanh");
//        System.out.println("Ten = " + employee.getName());
//
//        t.setTenNhanVien(employee);
//        System.out.println("Ten = " + employee.getName());

    }

}
