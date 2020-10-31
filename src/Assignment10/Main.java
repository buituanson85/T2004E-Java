package Assignment10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void ShowMenu(){
        System.out.println("=================");
        System.out.println("1.Insert news");
        System.out.println("2.View list news");
        System.out.println("3.Average rate");
        System.out.println("4.Exit");
        System.out.println("=================");
        System.out.println("MỜi nhập lựa chọn");
    }

    public static void main(String[] args) {
        ArrayList<News> NewsList = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        int id =1;
        do {
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
                    News news = new News();
                    news.InputNew();
//                    news.id = id++;
                    NewsList.add(news);
                    break;
                case 2:
                    System.out.println("Danh sách tin: " + id);
                    for (int i = 0; i < NewsList.size(); i++) {
                        NewsList.get(i).Display();
                    }
                    break;
                case 3:
                    System.out.println("Danh sách tin sau khi tính trung bình rate:");
                    for (int i = 0; i < NewsList.size(); i++) {
                        NewsList.get(i).calculate();
                        NewsList.get(i).Display();
                    }
                    break;
                case 4:
                    System.out.println("Thoát......");
                    break;
                default:
                    System.err.println("Nhập lại......");
                    break;
            }
        }while (choice != 4);
    }
}
