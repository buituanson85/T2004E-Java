package BaiTap_03;

import java.util.Scanner;

public class Book {
    String bookName;
    String createdAt; // ngày xuất bản
    String nickName;

    public Book() {
    }

    public Book(String bookName, String createdAt, String nickName) {
        this.bookName = bookName;
        this.createdAt = createdAt;
        this.nickName = nickName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên sách");
        bookName = sc.nextLine();

        System.out.println("Nhập ngày xuất bản");
        createdAt = sc.nextLine();

        System.out.println("Nhập tên bút danh");
        nickName = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public void Display(){
        System.out.println(toString());
    }
}
