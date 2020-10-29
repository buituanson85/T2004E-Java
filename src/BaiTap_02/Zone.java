package BaiTap_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Zone {
    ArrayList<Area> areaList = new ArrayList<>();
    public void Input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số khu vực cho zone");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            Area area = new Area();
            area.Input();

            areaList.add(area);
        }
    }

    public void InputVehicle(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số xe cần thêm trong zone");
        int n = sc.nextInt();
        int choose;
        for (int i = 0; i < n; i++){
            ShowOption();
            choose = sc.nextInt();
            Vehicle vehicle;

            if (choose == 1){
                vehicle = new Car();
            }else {
                vehicle = new Container();
            }
            vehicle.Input();
            //tìm khu vực để lưu xe cộ.
            for (int j = 0; j < areaList.size(); j++){
                if (areaList.get(j).checkAvaiable(vehicle)){
                    areaList.get(j).addVehicle(vehicle);
                    break;
                }
            }
        }
    }

    private void ShowOption(){
        System.out.println("1.Nhập Car");
        System.out.println("2.Nhập Container");
        System.out.println("Lựa chọn");

    }

    public void Sort(){
        for (int i = 0; i < areaList.size(); i++){
            areaList.get(i).Sort();
        }
    }

    //ý 5
    public void ShowInfo(){
        for (int i = 0; i < areaList.size(); i++){
            areaList.get(i).ShowInfo();
        }
    }
}
