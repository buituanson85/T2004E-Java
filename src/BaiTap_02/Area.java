package BaiTap_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Area {
    String address;
    int width;
    int height;
    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public Area() {
    }

    public void Input(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Vị trí");
        address = sc.nextLine();

        System.out.println("Width: ");
        width = Integer.parseInt(sc.nextLine());

        System.out.println("height: ");
        height = Integer.parseInt(sc.nextLine());
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }



    //hàm check xem khu vực đấy có khả năng lưu chữ xe ko trả về true nếu ok ko thì false
    public boolean checkAvaiable(Vehicle vehicle){
        //xếp chéo
        int useWidth = 0;
        int useHeight = 0;

        for (Vehicle v : vehicleList){
            useWidth += v.getWidth();
            useHeight += v.getHeight();
        }

        int avaiableWidth = width - useWidth;
        int avaiableHeight = height - useHeight;

        if (avaiableWidth >= vehicle.getWidth() && avaiableHeight >= vehicle.height){
            return true;
        }else {
            return false;
        }
    }

    public void Sort(){
        Collections.sort(vehicleList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                if (o1.GetS() < o2.GetS()){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
    }
    //ý 5
    public void ShowInfo(){
        for (int i = 0; i < vehicleList.size(); i++){
            vehicleList.get(i).ShowInfo();
        }
    }
}
