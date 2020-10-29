package Assignment10;

import java.util.Scanner;

public class News implements INews {

    int[] RateList = new int[3];
     int id = 1;
    private String title;
    private String publishDate;
    private String Author;
    private String content;
    private float averageRate;

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        Author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    //tạo getter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }
    //tạo setter (ko có AverageRate)

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public void Display() {
        System.out.println("Title: " + title + "; PublishDate: " + publishDate +
                "; Author: " + Author + "; Content: " + content + "; AverageRate: " + averageRate);
    }

    public void Show(){

    }

    public void calculate(){
        averageRate = ((float)RateList[0] + (float)RateList[1] + (float)RateList[2])/(float)RateList.length;
    }

    public void InputNew(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập title: ");
        title = sc.nextLine();

        System.out.print("Nhập publish date: ");
        publishDate = sc.nextLine();

        System.out.print("Nhập author: ");
        Author = sc.nextLine();

        System.out.print("Nhập content: ");
        content = sc.nextLine();

        System.out.println("Nhập các đánh giá:");
        for (int i = 0; i < 3; i++) {
            do {
                System.out.printf("Đánh giá %d: ", i + 1);
                RateList[i] = Integer.parseInt(sc.nextLine());
            } while (!(1 <= RateList[i] && RateList[i] <= 5));
        }
    }
}
