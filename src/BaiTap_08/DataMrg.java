package BaiTap_08;

import java.util.ArrayList;
import java.util.List;

public class DataMrg {
    private static DataMrg instance = null;

    List<Student> students;
    List<Teacher> teachers;
    List<Subject> subjects; // môn học
    List<ClassRoom> classRooms; //danh sách các lớp học
    List<ClassGroup> classGroups;  //lơp học
    List<Schedule> schedules;  // lập lịch dạy
    List<Attendence> attendences; // điểm danh
    private DataMrg(){
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        subjects = new ArrayList<>();
        classRooms = new ArrayList<>();
        classGroups = new ArrayList<>();
        schedules = new ArrayList<>();
        attendences = new ArrayList<>();
    }

    public static DataMrg getInstance(){
        if (instance == null){
            instance = new DataMrg();
        }
        return instance;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public List<ClassGroup> getClassGroups() {
        return classGroups;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<Attendence> getAttendences() {
        return attendences;
    }
}
