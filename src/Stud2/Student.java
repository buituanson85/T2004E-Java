package Stud2;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String batch;
    private float mathematicMark;
    private float physicMark;
    private float chemystryMark;

    public Student() {
    }

    public Student(int id, String name, String batch, float mathematicMark, float physicMark, float chemystryMark) {
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.mathematicMark = mathematicMark;
        this.physicMark = physicMark;
        this.chemystryMark = chemystryMark;
    }

    public int getId() {
        return id;
    }

    public boolean setId(int id) {
        if (id >= 100 ){
            this.id = id;
            return true;
        }else {
            System.err.println("Id is positive number >= 100");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name!= null && !name.contains(" ") && !name.isEmpty()){
            this.name = name;
            return true;
        }else {
            System.err.println("Cannot be blank");
            return false;
        }
    }

    public String getBatch() {
        return batch;
    }

    public boolean setBatch(String batch) {
        if (batch!= null && !batch.contains(" ") && !batch.isEmpty()){
            this.batch = batch;
            return true;
        }else {
            System.err.println("Cannot be blank");
            return false;
        }
    }

    public float getMathematicMark() {
        return mathematicMark;
    }

    public boolean setMathematicMark(float mathematicMark) {
        if (mathematicMark >= 0 && mathematicMark <= 100){
            this.mathematicMark = mathematicMark;
            return true;
        }else {
            System.err.println("Mark must be greater than Zero");
            return false;
        }
    }

    public float getPhysicMark() {
        return physicMark;
    }

    public boolean setPhysicMark(float physicMark) {
        if (physicMark >= 0 && physicMark <= 100){
            this.physicMark = physicMark;
            return true;
        }else {
            System.err.println("Mark must be greater than Zero");
            return false;
        }
    }

    public float getChemystryMark() {
        return chemystryMark;
    }

    public boolean setChemystryMark(float chemystryMark) {
        if (chemystryMark >= 0 && chemystryMark <= 100){
            this.chemystryMark = chemystryMark;
            return true;
        }else {
            System.err.println("Mark must be greater than Zero");
            return false;
        }
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        while (true){
            int _id;
            while (true){
                try {
                    _id = Integer.parseInt(sc.nextLine());
                    break;
                }catch(NumberFormatException e){
                    System.err.println("Id is positive number >= 100");
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                    sc = new Scanner(System.in);
                }
            }
            boolean check = setId(_id);
            if (check){
                break;
            }
        }

        System.out.println("Nhập tên: ");
        while (true){
            String _name = sc.nextLine();
            boolean check = setName(_name);
            if (check){
                break;
            }
        }

        System.out.println("Nhập batch: ");
        while (true){
            String _batch = sc.nextLine();
            boolean check = setBatch(_batch);
            if (check){
                break;
            }
        }

        System.out.println("Nhập điểm mathematic: ");
            while (true){
                float _mathematicMark;
                while (true){
                    try {
                        _mathematicMark = Float.parseFloat(sc.nextLine());
                        break;
                    } catch (Exception e){
                        System.err.println("Mark must be number");
                    }
                }
                boolean check = setMathematicMark(_mathematicMark);
                if (check){
                    break;
                }
            }

        System.out.println("Nhập điểm physic: ");
        while (true){
            float _physicMark;
            while (true){
                try {
                    _physicMark = Float.parseFloat(sc.nextLine());
                    break;
                } catch (Exception e){
                    System.err.println("Mark must be number");
                }
            }
            boolean check = setPhysicMark(_physicMark);
            if (check){
                break;
            }
        }

        System.out.println("Nhập điểm chemystry: ");
        while (true){
            float _chemystryMark;
            while (true){
                try {
                    _chemystryMark = Float.parseFloat(sc.nextLine());
                    break;
                } catch (Exception e){
                    System.err.println("Mark must be number");
                }
            }
            boolean check = setChemystryMark(_chemystryMark);
            if (check){
                break;
            }
        }
    }

    public float average(){
        return (mathematicMark + physicMark + chemystryMark)/3;
    }

    public void print(){
        System.out.printf("%-15d %-15s %-15s %-15f %-15f %-15f %-15f", id, name, batch, mathematicMark, physicMark, chemystryMark, average());

    }
}
