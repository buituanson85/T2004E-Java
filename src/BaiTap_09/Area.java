package BaiTap_09;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Area implements IStatus {
    static enum STATUS{
        EMPTY, LESS, NORMAL, FULL
    };
    STATUS status;
    String currentTime;
    String name;

    public Area() {
        currentTime = " ";
        status = STATUS.EMPTY;
    }

    public Area(String name) { //tạo thêm
        this.name = name;
        currentTime = " ";
        status = STATUS.EMPTY;
    }

    public Area(STATUS status, String currentTime, String name) {
        this.status = status;
        this.currentTime = currentTime;
        this.name = name;
    }

    public STATUS getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(STATUS status) {
        autoCurrentTime();
        this.status = status;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public void autoCurrentTime(){
        SimpleDateFormat format = new SimpleDateFormat("H:m:s dd:MM:yyyy");
        Date time = new Date();
        currentTime = format.format(time);
    }

    @Override
    public void onStatus() {
        switch (status){
            case EMPTY -> System.out.println(name + " đang trống");
            case LESS -> System.out.println(name + " đang ít khách");
            case NORMAL -> System.out.println(name + " khách vùa đủ phục vụ");
            case FULL -> System.out.println(name + " đang đông khách");
        }
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("0. EMPTY");
        System.out.println("1. LESS");
        System.out.println("2. NORMAL");
        System.out.println("3. FULL");
        System.out.println("choose: ");
        int option = Integer.parseInt(sc.nextLine());

        switch (option){
            case 0:
                setStatus(STATUS.EMPTY);
                break;
            case 1:
                setStatus(STATUS.LESS);
                break;
            case 2:
                setStatus(STATUS.NORMAL);
                break;
            default:
                setStatus(STATUS.FULL);
                break;
        }
    }
}
