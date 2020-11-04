package Test2;

import Stud2.Student;

import java.util.Scanner;

public class StudentManager {
    Stud2.Student objS;
    Stud2.Student[] arr;
    Scanner sc;
    int maxStud, nextStud=0;
    int key = 0;

    public StudentManager() {
        sc = new Scanner(System.in);
        System.out.print("Enter a max Student: ");
        maxStud = sc.nextInt();
        arr = new Stud2.Student[maxStud];
    }

    public void add(){
        if (nextStud == maxStud){
            System.out.println("Array is full !!!");
            return;
        }
        objS = new Student();
        objS.inputInfo();
        arr[nextStud] = objS;
        nextStud++;
    }

    public void display(){
        if (nextStud == 0){
            System.out.println("Array is Empty");
            return;
        }
        for (int i = 0; i < nextStud; i++) {
            arr[i].print();
        }
    }

    public void removeStud(int id){
        boolean check = false;
        for (int i = 0; i < nextStud; i++) {
            if (arr[i].getId() == id){
                check = true;
                key = i;
                break;
            }
        }
        if (check == false){
            System.out.println("Not Found!!!");
        }else{
            for(int i=key; i < nextStud-1; i++){
                    arr[i]=arr[i+1];
            }
            nextStud--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager objSM = new StudentManager();
        int opt, id;
        while(true){
            System.out.println("-----Student Manager-----");
            System.out.println("1. Create New student");
            System.out.println("2. Remove Student by ID");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Enter an optiion: ");
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    objSM.add();
                    break;
                case 2:
                    System.out.print("Enter an ID for search: ");
                    id = sc.nextInt();
                    objSM.removeStud(id);
                    break;
                case 3:
                    objSM.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please choose from 1-4.");
            }
        }
    }

}
