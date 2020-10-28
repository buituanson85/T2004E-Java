package Gokisoft;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student std = new Student("Sơn","001", 35, "buituanson85@gmail.com", "Nam", "Xã Đàn");
//        std.getName();
//        std.rollNo = "001";
        Student [] students = new Student[255];
        students[0] = new Student(" Sơn", "001", 345, "ds2adada", "Nam", "Xã đàn");
        students[1] = new Student(" Sơn1", "0021", 335, "d3sadada", "Nam", "Xã đàn");
        students[2] = new Student(" Sơn2", "0031", 325, "ds4adada", "Nam", "Xã đàn");
        students[3] = new Student(" Sơn3", "0041", 325, "dsa5dada", "Nam", "Xã đàn");
        students[4] = new Student(" Sơn4", "0051", 315, "dsad5ada", "Nam", "Xã đàn");

        //list array list
        List<Student> studentList = new ArrayList<>();
        Student std = new Student(" Sơn", "001", 345, "ds2adada", "Nam", "Xã đàn");
        studentList.add(std);
        std = new Student(" Sơn1", "0021", 335, "d3sadada", "Nam", "Xã đàn");
        studentList.add(std);
        std = new Student(" Sơn2", "0031", 325, "ds4adada", "Nam", "Xã đàn");
        studentList.add(std);
        std = new Student(" Sơn3", "0041", 325, "dsa5dada", "Nam", "Xã đàn");
        studentList.add(std);
        std = new Student(" Sơn4", "0051", 315, "dsad5ada", "Nam", "Xã đàn");
        studentList.add(std);

        for (int i = 0; i < studentList.size(); i++){
            Student _std = studentList.get(i);
            std.showInfo();
        }
    }
}
