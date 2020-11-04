package BaiTap_09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IStatus> statusList = new ArrayList<>();
        System.out.println("Nhập 3 quầy bán vé");
        for (int i = 0; i < 3; i++){
            TicketCounter ticketCounter = new TicketCounter();
            ticketCounter.input();

            statusList.add(ticketCounter);
        }
        System.out.println("Nhập 2 quầy bán đồ ăn");
        for (int i = 0; i < 2; i++){
            Food food = new Food();
            food.input();

            statusList.add(food);
        }
        System.out.println("Nhập 2 bãi đỗ xe");
        for (int i = 0; i < 2; i++){
            Parking parking = new Parking();
            parking.input();

            statusList.add(parking);
        }
        System.out.println("Nhập 5 phòng xem phim");
        for (int i = 0; i < 5; i++){
            Room room = new Room();
            room.input();

            statusList.add(room);
        }
        System.out.println("Hiển thị thông tin trạng thái");
        followStatus(statusList);
    }

    static void followStatus(List<IStatus> statusList){
        for (IStatus iStatus : statusList){
            iStatus.onStatus();
        }
    }
}
