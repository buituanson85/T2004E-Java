package Assignment6;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice = 0;
        Student[] sinhviens = new Student[255];
        int counter = 0;
        do {
            System.out.println("-------");
            System.out.println("1.Thêm mới sinh viên");
            System.out.println("2.họ tên, số điện thoại của sinh viên ");
            System.out.println("3.các sinh viên có tuổi > 1993");
            System.out.println("4.sinh viên là nam và có tuổi >= 1995");
            System.out.println("5.thoát");
            System.out.println("-------");
            System.out.println("Nhập lựa chọn");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    Student sinhvien = new Student();
                    sinhvien.InputInfo();
                    sinhviens[counter++] = sinhvien;
                    break;
                case 2:
                    System.out.printf("%-20s %-20s \n", "fullName", "phone");
                    for (int i = 0; i < counter; i++){
                        sinhvien = sinhviens[i];
                        if (sinhvien != null){
                            sinhvien.ShowInfo();
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.printf("%-20s %-20s \n", "fullName", "YearBird");
                    for (int i = 0; i < counter; i++) {
                        sinhvien = sinhviens[i];
                        if (sinhviens[i].getYearBird() < 1993 ){  //kiểm tra nhập vào đúng chuỗi dấy chưa
                            sinhvien.ShowInfoYear();
                        }
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.printf("%-20s %-20s \n", "fullName", "YearBird");
                    String sexSearch = "Nam";
                    for (int i = 0; i < counter; i++) {
                        sinhvien = sinhviens[i];
                        if (sinhviens[i].getSex().equals(sexSearch) == true && sinhviens[i].getYearBird() <= 1995){  //kiểm tra nhập vào đúng chuỗi dấy chưa
                            sinhvien.ShowInfoYear();
                        }
                    }
                    break;
                default:
                    System.out.println("Chọn lại.....");
            }
        }while(choice !=5);
        System.out.println("END.......");
    }
}
