package com.qlsv.thongtinsinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Applicatioj {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList dssv = new ArrayList();
        do{
            System.out.println("===== Student management system =====");
            System.out.println("1.Add student");
            System.out.println("2.Show to student");
            System.out.println("3.Find out students age > 1993, print their full name and year of birth");
            System.out.println("4.Search student by name");
            System.out.println("5.Thoát");
            System.out.println("======================================");

            System.out.println("Nhập vào lựa chọn");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    SinhVien sv = new SinhVien();
                    sv.Nhap();
                    dssv.add(sv);
                    break;
                case 2:
                    for (int i = 0; i < dssv.size(); i++){
                      SinhVien _sv = (SinhVien)dssv.get(i);  // ép kiểu
                      _sv.hienthi();
                    }
                    break;
                case 3:
                    for (int i = 0; i < dssv.size(); i++){
                        SinhVien _sv = (SinhVien)dssv.get(i);  // ép kiểu
                        if (_sv.getYearBird() <1993){
                            _sv.hienthi();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhap ten sv muon tim:");
                    sc.nextLine();
                    String tensv = sc.nextLine();

                    boolean timthay = false;
                    for (int i = 0; i < dssv.size(); i++){
                        SinhVien _sv = (SinhVien)dssv.get(i);  // ép kiểu
                        if (_sv.getFullName().equalsIgnoreCase(tensv)){
                            _sv.hienthi();
                            timthay = true;
                            break;
                        }
                    }
                    if (!timthay){ // viết như timthay == false
                        System.out.println("Ko thấy");
                    }

                    break;
            }
        }while (choice!=5);
    }
}

