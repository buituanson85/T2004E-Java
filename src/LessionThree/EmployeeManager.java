package LessionThree;

import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice = 0;
        Employee employee = new Employee();
        do {
            System.out.println("-------");
            System.out.println("1.Thêm mới");
            System.out.println("2.Hiển thị");
            System.out.println("3.sửa");
            System.out.println("4.Thoát");
            System.out.println("-------");
            System.out.println("Nhập lựa chọn");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    employee.inputInfo();
                    break;
                case 2:
                    employee.showInfo();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Địa chỉ mới");
                    String addressNew = sc.nextLine();
                    employee.setAddress(addressNew);
                    employee.showInfo();
                    break;
                default:
                    System.out.println("Chọn lại.....");
            }
        }while (choice !=4 );
        System.out.println("END.......");
    }
}


