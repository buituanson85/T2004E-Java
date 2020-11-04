package BaiTap_09;

import java.util.Scanner;

public class Room extends Area {
    int total; //tổng số ghế của phòng chiếu phim
    int num; // số ghế đang ngồi

    public Room() {
        super("Phòng xem phim");
    }

    public Room(int total, int num) {
        super("Phòng xem phim");
        this.total = total;
        this.num = num;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tổng số ghế: ");
        total = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập số ghế đã ngồi: ");
        num = Integer.parseInt(sc.nextLine());
        setupStatus();
    }

    public void setupStatus(){ //đếm xem bao nhiêu khách thì rỗng vừa đông
        if (num == 0){
            status = Area.STATUS.EMPTY;
        }else {
            //        float present = ((float)num)/total;
            int present = (num * 100)/total;//tự động làm tròn về số nguyên
            //present <25% LESS
            //present >=25% <70% normal
            //present >=70% full
            if (present >= 70){
                status = Area.STATUS.FULL;
            }else if (present >=25){
                status = Area.STATUS.NORMAL;
            }else {
                status = Area.STATUS.LESS;
            }
        }
        autoCurrentTime();
    }
}
