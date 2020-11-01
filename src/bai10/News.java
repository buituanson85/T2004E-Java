package bai10;

import java.util.Scanner;

public class News implements INews {
    public static int couterNews;

    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float avgRate;

    private int[] rateList = new int[3];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAvgRate() {
        return avgRate;
    }

    public void inputRate() {
        if(this.rateList == null) {
            this.rateList = new int[3];
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Nhap rate 1");
        this.rateList[0] = s.nextInt();

        System.out.println("Nhap rate 2");
        this.rateList[1] = s.nextInt();

        System.out.println("Nhap rate 3");
        this.rateList[2] = s.nextInt();
    }

    @Override
    public void display() {
        System.out.println(id + ", "
                + title + ", "
                + publishDate + ", "
                + content + ", "
                + author + ", "
                + avgRate);
    }

    public void caculate() {
        avgRate =
                (float)( (float)rateList[0]
                        + (float)rateList[1] +
                        (float)rateList[2])/3;
    }
}
