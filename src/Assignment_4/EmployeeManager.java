package Assignment_4;

import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Scanner sc = new Scanner(System.in);
        int choise,n;
        Employee[] employee = null;

        do {
            showMenu();
            System.out.print("Mời bạn chọn chức năng: ");
            choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1: {
                    System.out.println("Nhập vào số lượng nhân viên cần thêm: ");
                    n = sc.nextInt();
                    employee = new Employee[n];
                    for (int i = 0 ; i < n ; i++){
                        System.out.println("=== Nhập thông tin nhân viên thứ : " + (i+1) + " ===");
                        employee[i] = new Employee();
                        employee[i].inputInfo();
                    }
                    sc.nextLine();
                    break;
                }
                case 2:
                    System.out.println("=== Danh sách nhân viên công ty. ===");
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "name", "address", "phoneNumber", "yearOfBirth", "yearInToTheCompany");
                    if(employee != null) {
                        for (int i = 0; i < employee.length; i++) {
                            employee[i].showInfo();
                        }
                    }else{
                            System.out.println("Trong danh sách chưa có nhân viên");
                    }
                    break;
                case 3:
                    System.out.println("Sửa thông tin nhân viên");
                    String names = sc.nextLine();
                    boolean search = false;
                        for (int i = 0; i < employee.length; i++) {
                           if (names == employee[i].getName()){
                               System.out.println("Mời bạn nhập địa chỉ thay đổi");
                               sc.nextLine();
                               String adresss = sc.nextLine();
                               employee1.setAddress(adresss);
                               employee1.showInfo();
                               search = true;
                               break;
                           }
                        }
                        if (search == false){
                            System.out.println("No staff found");
                        }
                    break;
                case 4:
                    System.out.println("Exit!!");
                    break;
                default:
                    System.err.println("Nhập lại lựa chọn");
                    break;
            }
        }while( choise!=4 );

    }
    public static void showMenu(){
        System.out.println("===== Hệ thống quản lý nhân viên =====");
        System.out.println("1. Thêm nhân viên.");
        System.out.println("2. Hiên thị danh sách các nhân viên.");
        System.out.println("3. Sửa thông tin nhân viên");
        System.out.println("4. Thoát.");
        System.out.println("======================================");
    }
}

/* - tạo đối tượng sinh viên
- viết hàm nhập thông tin sinh viên
- hàm in thông tin cho sinh viên

 */
