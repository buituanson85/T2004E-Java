package Assignment11;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Book {

    String bookName;
    String createdAt; // ngày xuất bản
    String author;
    float price;

    public Book() {
    }

    public Book(String bookName, String createdAt, String author, float price) {
        this.bookName = bookName;
        this.createdAt = createdAt;
        this.author = author;
        this.price = price;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        bookName = sc.nextLine();

        System.out.print("Nhập Tên tác giả: ");
        author = sc.nextLine();

        System.out.print("Nhập ngày xuất bản: ");
       while (true){
           try {
               createdAt = sc.nextLine();
               SimpleDateFormat sdf =
                       new SimpleDateFormat("MM/dd/yyyy");
               sdf.parse(createdAt);
               break;
           }catch (Exception e) {
               //e.printStackTrace();
               System.out.println("Input MM/dd/yyyy.");
           }
       }

        System.out.print("Nhập giá sách: ");

        while (true){
            try {
                price = Float.parseFloat(sc.nextLine());
                break;
            }catch (InputMismatchException e){
                System.err.println("Nhập số nguyên");
            }catch (Exception e){
                System.err.println("Nhập số nguyên");
            }finally {

            }
        }
    }
    public void display(){
        System.out.println(toString());
    }
}
