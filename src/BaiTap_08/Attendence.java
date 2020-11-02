package BaiTap_08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Attendence {
    enum STATUS{
        PRESENT, ABSENT, PA
    };
    String rollNo;
    int scheduleId;
    String createdAt; //thời gian điểm danh
    String updateAt;
    STATUS status;

    public Attendence() {
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã sinh viên: ");
        rollNo = sc.nextLine();

        System.out.println("Nhập scheduleId: ");
        scheduleId = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập scheduleId: ");
        scheduleId = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập Status");
        System.out.println("1.Present");
        System.out.println("2.Absent");
        System.out.println("3.PA"); // Nghỉ có phép
        System.out.println("Chọn: ");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                status = STATUS.PRESENT;
                break;
            case 2:
                status = STATUS.ABSENT;
                break;
            default:
                status = STATUS.PA;
                break;
//            default:
//                System.out.println("chọn sai");
//                break;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        Date date =new Date();
        createdAt = simpleDateFormat.format(date);
        updateAt = simpleDateFormat.format(date);
    }

    @Override
    public String toString() {
        return "Attendence{" +
                "rollNo='" + rollNo + '\'' +
                ", scheduleId=" + scheduleId +
                ", createdAt='" + createdAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                ", status=" + getStatusString() +
                '}';
    }

    public String getStatusString(){
        switch (status){
            case PRESENT:
                return "Present";
            case ABSENT:
                return "Absent";
            default:
                return "PA";
        }
    }
}
