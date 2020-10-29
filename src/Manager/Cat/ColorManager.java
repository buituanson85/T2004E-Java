package Manager.Cat;

import cat.exam.CatDetail;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorManager {
    ArrayList<String> colorList = new ArrayList<>();

    public ColorManager() {
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số mèo cần thêm");
        while (true){
            System.out.println("Nhập mã màu cần thêm");
            String color = sc.nextLine();
            colorList.add(color);

            System.out.println("tiếp tục nhập hay không(y/n)");
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("n")){
                break;
            }
        }
    }

    public void Display(){
        System.out.println("Danh sách mã màu");
        for (int i = 0; i < colorList.size(); i++){
            System.out.println(" " + colorList.get(i));
        }
    }

    public int checkColor(String color){
//        return colorList.contains(color);
        for (int i = 0; i < colorList.size(); i++){
            if (colorList.get(i).equalsIgnoreCase(color)){
                return i;
            }
        }
        return -1;
    }
}
