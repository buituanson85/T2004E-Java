package BaiTap_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose;
        int n;

        ArrayList<Author> authorList = new ArrayList<>();
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            ShowMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhập số sách cần thêm");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++){
                        Book book = new Book();
                        book.Input();
                        boolean isFind = false;
                        for (int j = 0; j < authorList.size(); j++){
                            if (authorList.get(j).getNickName().equalsIgnoreCase(book.getNickName())){
                                isFind = true;
                                break;
                            }
                        }
                        if (!isFind){
                            Author author = new Author(book.nickName);
                            author.Input(authorList);

                            authorList.add(author);
                        }
                        bookList.add(book);
                    }
                    break;
                case 2:
                    for (Book book : bookList){
                        book.Display();
                    }
                    break;
                case 3:
                    // nhập thông tin tác giả

                    System.out.println("Nhập số tác giả cần thêm");
                    n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++){
                        Author author = new Author();
                        author.Input(authorList);

                        authorList.add(author);
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên bút danh");
                    String nickName = sc.nextLine();

                    for (int i = 0 ; i < bookList.size(); i++){
                        if (bookList.get(i).getNickName().equalsIgnoreCase(nickName)){
                            bookList.get(i).Display();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("Nhập sai");
                    break;
            }

        }while (choose != 5);
    }

    static void ShowMenu(){
        System.out.println("1.Nhập thông tin sách");
        System.out.println("2.Hiển thị tất cả sách");
        System.out.println("3.Nhập thông tin tác giả");
        System.out.println("4.tìm kiếm sách theo bút danh");
        System.out.println("5.thoát");
    }
}
