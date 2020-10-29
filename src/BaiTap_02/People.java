package BaiTap_02;

import java.util.Scanner;

public class People {
    String id;
    String fullName;
    int old;

    public People() {
    }

    public People(String id, String fullName, int old) {
        this.id = id;
        this.fullName = fullName;
        this.old = old;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id");
        id = sc.nextLine();

        System.out.println("Nhập tên");
        fullName = sc.nextLine();

        System.out.println("Nhập tuổi");
        old = sc.nextInt();
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", old=" + old +
                '}';
    }

    public void ShowInfo(){
        System.out.println(toString());
    }

    //get && set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
}
