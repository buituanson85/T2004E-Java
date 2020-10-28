package Assignment9;

import java.awt.*;
import java.util.Scanner;

public class ManagePhoneBook {
         static PhoneBook danhba = new PhoneBook();
         static Scanner sc = new Scanner(System.in);
         static String name, phone;
    private static Object Phone;

    public static void Menu(){
        System.out.println("Phone book manager system");
        System.out.println("1.Insert Phone");
        System.out.println("2.Remove phone");
        System.out.println("3.Update phone");
        System.out.println("4.Search phone");
        System.out.println("5.Sort");
        System.out.println("6.Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();
        int choice;
        do {
            System.out.println("Nhập lựa chọn");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    insertPhone();
                    break;
                case 2:
                    remuvePhone();
                    break;
                case 3:
                    updatePhone();
                    break;
                case 4:
                    searchPhone();
                    break;
                case 5:
                    sortPhone();
                    break;
                case 6:
                    return;
            }
        }while (choice != 6);
    }

    private static void remuvePhone(){
        sc.nextLine();
        System.out.println("Nhập tên người cần xóa");
        name = sc.nextLine();
        danhba.remuvePhone(name);
    }

    private static void searchPhone(){
        sc.nextLine();
        System.out.println("tìm kiếm");
        name = sc.nextLine();
        danhba.searchPhone(name);
    }

    private static void updatePhone(){
        boolean seachn = false;
        sc.nextLine();
        System.out.println("Bạn tên người cần update");
        name = sc.nextLine();
        for (int i = 0; i < danhba.PhoneList.size(); i++){
            if (name.equalsIgnoreCase(danhba.PhoneList.get(i).substring(0, danhba.PhoneList.get(i).indexOf(",")))){
                seachn = true;
                System.out.println("Nhập số đt mơi");
                    Phone = sc.nextLine();
                danhba.updatePhone(name, phone);
                break;
            };
        }
        if (!seachn){
            System.out.println("ko có ai trong danh ba tên " + name);
        }
    }

    private static void sortPhone(){
        danhba.sort();
    }

    private static void insertPhone(){
        sc.nextLine();
        System.out.println("Nhập tên");
        name = sc.nextLine();
        System.out.println("Nhập so ddt");
        phone = sc.nextLine();
        danhba.insertPhone(phone, phone);
    }
}
