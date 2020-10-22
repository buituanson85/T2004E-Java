package LessionThree;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice = 0;
        Employee[] employees = new Employee[255];

        int counter = 0;
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
                    Employee employee = new Employee();
                    employee.inputInfo();
                    employees[counter++] = employee;
                    break;
                case 2:
                    for (int i =0 ; i < counter ; i++){
                        employee = employees[i];
                        if (employee != null){
                            employee.showInfo();
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Sửa thông tin nhân viên");
                    String names = sc.nextLine();
                    System.out.println("Mời bạn nhập địa chỉ thay đổi");
                    String adresss = sc.nextLine();

                    for (int i = 0; i < counter; i++) {
                        if (employees[i].getName().equalsIgnoreCase(names)){  //kiểm tra nhập vào đúng chuỗi dấy chưa
                            employees[i].setAddress(adresss);
                        }
                    }
                    break;
                default:
                    System.out.println("Chọn lại.....");
            }
        }while (choice !=4 );
        System.out.println("END.......");
    }
}
