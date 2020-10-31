package Assignment11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void ShowMenu(){
        System.out.println("=================");
        System.out.println("1.Nhập sách");
        System.out.println("2.Hiển thị danh sách sách");
        System.out.println("3.Hiển thị danh sách có giá lớn hơn 100.000");
        System.out.println("4.Tìm sách theo tên");
        System.out.println("5.Exit");
        System.out.println("=================");
        System.out.println("MỜi nhập lựa chọn");
    }

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            Book book = new Book();
            ShowMenu();
            while (true){
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                }catch (InputMismatchException e){
                    System.err.println("Nhập số nguyên");
                }catch (Exception e){
                    System.err.println("Nhập số nguyên");
                }finally {

                }
            }
            switch (choice){
                case 1:
                    book.input();
                    bookList.add(book);
                    break;
                case 2:
                    System.out.println("Danh sách sách: ");
                    for (int i = 0; i < bookList.size(); i++){
                        bookList.get(i).display();
                    }
                    break;
                case 3:
                    System.out.println("ds các sách có giá lớn hơn 100.000: ");
                    int count = 0;
                    for (int i = 0; i < bookList.size(); i++){
                        if (bookList.get(i).getPrice() > 100000 ){
                            bookList.get(i).display();
                            count++;
                        }
                    }
                    if (count == 0){
                        System.err.println("ko có sách nào giá lớn hơn 100000");
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên sách cần tìm");
                    String _book = sc.nextLine();
                    int _count = 0;
                    for (int i = 0; i < bookList.size(); i++){
                        if (bookList.get(i).getBookName().equalsIgnoreCase(_book)){
                            bookList.get(i).display();
                            _count++;
                        }
                    }
                    if (_count == 0){
                        System.err.println("ko có sách nào tên như thế");
                    }
                    break;
                case 5:
                    System.out.println("Good bye.........");
                    break;
                default:
                    System.err.println("Chọn sai......");
                    break;
            }
        }while (choice != 5);
    }
}
