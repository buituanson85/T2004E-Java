package BaiTap_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Schedule {
    private int scheduleId,teacherId;
    private String teacherCode;
    private String subjectCode;
    private String classCode;
    private String createdAt; // thời gian bắt đầu
    private String expiredAt;  //thời gian kết thúc
    List<String> teachingTime;  //khung giờ dạy
    private float fromTime,toTime;

    public Schedule() {
        teachingTime = new ArrayList<>();
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    public List<String> getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(List<String> teachingTime) {
        this.teachingTime = teachingTime;
    }

    public float getFromTime() {
        return fromTime;
    }

    public void setFromTime(float fromTime) {
        this.fromTime = fromTime;
    }

    public float getToTime() {
        return toTime;
    }

    public void setToTime(float toTime) {
        this.toTime = toTime;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Id");
        scheduleId = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập mã lớp học:");
        classCode = sc.nextLine();

        System.out.println("Nhập mã môn học:");
        subjectCode = sc.nextLine();

        System.out.println("Nhập mã giáo viên:");
        teacherCode = sc.nextLine();

        System.out.println("Nhập ngày bắt đầu:");
        createdAt = sc.nextLine();

        System.out.println("Nhập ngày kết thúc:");
        expiredAt = sc.nextLine();

        System.out.println("Nhập Lịch dạy:");
        int i = 1;
        for ( ; ; ){
//            System.out.format("Time: (%d)", i);
            System.out.format("Time: (%d)", teachingTime.size() + 1);
            teachingTime.add(sc.nextLine());
            System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
            String c = sc.nextLine();
//            i++;
            if (c.equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("Thời gian bắt đầu dạy: ");
        fromTime = Float.parseFloat(sc.nextLine());

        System.out.println("Thời gian kết thúc dạy: ");
        toTime = Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "scheduleId=" + scheduleId +
                ", teacherId=" + teacherId +
                ", teacherCode='" + teacherCode + '\'' +
                ", subjectCode='" + subjectCode + '\'' +
                ", classCode='" + classCode + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", expiredAt='" + expiredAt + '\'' +
                ", fromTime=" + fromTime +
                ", toTime=" + toTime;
    }

    public void display(){
        System.out.println(toString());
        System.out.println("teacherching time: ");
        for (int i = 0; i < teachingTime.size(); i++){
            System.out.println(teachingTime.get(i));
        }
    }
}
