package BaiTap_02;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleMrg {
    ArrayList<People> peopleList = new ArrayList<>();

    public void Input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số chủ xe");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            People people = new People();
            people.Input();

            peopleList.add(people);
        }
    }
}
