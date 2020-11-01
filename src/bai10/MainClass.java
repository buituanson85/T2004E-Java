package bai10;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public void inputNew(News n) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap id:");
        int id = 0;
        while(true) {
            try {
                id = s.nextInt();
                n.setId(id);
                break;
            } catch (Exception e) {
                s.nextLine();
                System.out.println("Input integer.");
            }
        }

        s.nextLine();
        System.out.println("Nhap title:");
        String title = s.nextLine();
        n.setTitle(title);

        System.out.println("Nhap author:");
        String author = s.nextLine();
        n.setAuthor(author);

        System.out.println("Nhap content:");
        String content = s.nextLine();
        n.setContent(content);

        System.out.println("Nhap publish Date (MM/dd/yyyy):");
        String publishDate = "";

        while(true) {
            try {
                publishDate = s.nextLine();
                SimpleDateFormat sdf =
                        new SimpleDateFormat("MM/dd/yyyy");
                sdf.parse(publishDate);

                n.setPublishDate(publishDate);
                break;
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Input MM/dd/yyyy.");
            }
        }

        n.inputRate();
    }
    
    public static void main(String[] args) {
        int choice = 0;
        Scanner s = new Scanner(System.in);

        MainClass m = new MainClass();

        ArrayList listNews = new ArrayList();

        do {
            System.out.println("=== Begin menu ===");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("=== End menu ===");

            System.out.println("input choice ? ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    News n = new News();
                    m.inputNew(n);
                    News.couterNews++;
                    listNews.add(n);
                    break;
                case 2:
                    System.out.println("Total news: " + News.couterNews);
                    for(int i = 0; i < listNews.size(); i++) {
                        News _n = (News)listNews.get(i);
                        _n.display();
                    }
                    break;
                case 3:
                    System.out.println("Total news: " + News.couterNews);
                    for(int i = 0; i < listNews.size(); i++) {
                        News _n = (News)listNews.get(i);
                        _n.caculate();
                        _n.display();
                    }
                    break;
            }
        } while (choice != 4);
    }
}

