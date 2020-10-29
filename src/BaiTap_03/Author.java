package BaiTap_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    private String name;
    private int old;
    private String nickName;
    private String birthDay;
    private String address;

    public Author() {
    }

    public Author(String nickName) {
        this.nickName = nickName;
    }

    public Author(String name, int old, String nickName, String birthDay, String address) {
        this.name = name;
        this.old = old;
        this.nickName = nickName;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getNickName() {
        return nickName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getAddress() {
        return address;
    }

    //để kiểm tra đã tồn tại bút danh tác giả đó hay chưa chuyền một mảng arraylist vào hàm input
    public void Input(ArrayList<Author> authorList){
        Scanner sc = new Scanner(System.in);
        Input();

        System.out.println("Nhập bút danh tác giả");
        while (true){
            nickName = sc.nextLine();
            boolean isFind = false;
            for (int i = 0; i < authorList.size(); i++){
                if (authorList.get(i).getNickName().equalsIgnoreCase(nickName)){
                    isFind = true;
                    break;
                }
            }
            if (!isFind){
                break;
            }else {
                System.err.println("Nhập bút danh khác:");
            }
        }
    }

    //câu 1
    public void Input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên tác giả");
        name = sc.nextLine();

        System.out.println("Nhập tuổi tác giả");
        old = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập ngày sinh tác giả");
        birthDay = sc.nextLine();

        System.out.println("Nhập địa chỉ tác giả");
        address = sc.nextLine();
    }
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", nickName='" + nickName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void Display(){
        System.out.println(toString());
    }


}
