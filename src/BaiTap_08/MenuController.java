package BaiTap_08;

import java.util.Scanner;

public class MenuController {
    private static MenuController instance = null;

    private MenuController(){

    }

    public synchronized static MenuController getInstance(){
        if (instance == null){
            instance = new MenuController();
        }
        return instance;
    }

    public void showMenu(){
        System.out.println("1.thêm giáo viên.");
        System.out.println("2.thêm sinh viên");
        System.out.println("3.thêm môn học");
        System.out.println("4.thêm lớp học");
        System.out.println("5. thêm lịch học");
        System.out.println("6.thêm điểm danh");
        System.out.println("7.hiên thị thông tin điểm danh");
        System.out.println("8.Exit");
    }

    public void inputTeacher(){
        for ( ; ; ){
            Teacher teacher = new Teacher();
            teacher.inputInfo();

            DataMrg.getInstance().getTeachers().add(teacher);
            if (!hasNext()){
                break;
            }
        }
    }

    public void inputStudent(){
        for ( ; ; ){
            Student student = new Student();
            student.inputInfo();

            DataMrg.getInstance().getStudents().add(student);
            if (!hasNext()){
                break;
            }
        }
    }

    public void inputClassRoom(){
        for ( ; ; ){
            ClassRoom classRoom = new ClassRoom();
            classRoom.inputInfo();

            DataMrg.getInstance().getClassRooms().add(classRoom);
            if (!hasNext()){
                break;
            }
        }
    }

    public void inputClassGroop(){
        for ( ; ; ){
            ClassGroup classGroup = new ClassGroup();
            classGroup.inputInfo();

            DataMrg.getInstance().getClassGroups().add(classGroup);
            if (!hasNext()){
                break;
            }
        }
    }

    public void inputSchedule(){
        for ( ; ; ){
            Schedule schedule = new Schedule();
            schedule.inputInfo();

            DataMrg.getInstance().getSchedules().add(schedule);
            if (!hasNext()){
                break;
            }
        }
    }

    public void inputAttendence(){
        for ( ; ; ){
            Attendence attendence = new Attendence();
            attendence.inputInfo();

            DataMrg.getInstance().getAttendences().add(attendence);
            if (!hasNext()){
                break;
            }
        }
    }

    public void inputSubject(){
        for ( ; ; ){
            Subject subject = new Subject();
            subject.inputInfo();

            DataMrg.getInstance().getSubjects().add(subject);
            if (!hasNext()){
                break;
            }
        }
    }

    public boolean hasNext(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
        String c = sc.nextLine();
//            i++;
        if (c.equalsIgnoreCase("N")){
            return false;
        }
        return true;
    }
}
