package Assignment12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Person implements IElectricity {
    final int price = 1500;
    final int quota = 100;
    private int id; //mã khách hàng
    private String name;
    private String date;//ngày ra hóa đơn
    private String type;//đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất)
    private float kw; //số lượng điện tiêu thụ
    private String phone;//phoneNumber
    private double wallet;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        this.name = name;
        if (name!= null && !name.contains(" ")){
            this.name = name;
            return true;
        }else {
            System.err.println("You have not entered a customer name");
            return false;
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getKw() {
        return kw;
    }

    public boolean setKw(float kw) {
        if (kw > 0 ){
            this.kw = kw;
            return true;
        }else {
            System.err.println("The electricity consumed must be greater than zero");
            return false;
        }
    }

    public String getPhone() {
        return phone;
    }

    public boolean setPhone(String phone) {
        if (phone.length() == 10 ){
            this.phone = phone;
            return true;
        }else {
            System.err.println("Phone number must enter 10 full numbers");
            return false;
        }
    }

    public double getWallet() {
        return wallet;
    }

    public boolean setWallet(double wallet) {
        if (wallet >= 0){
            this.wallet = wallet;
            return true;
        }else {
            System.err.println("The account balance must be greater than zero");
            return false;
        }
    }
    //Tạo hàm nhập thông tin khách hàng.

    public void inputInfo(ArrayList<Person> peopleList){
        Scanner sc = new Scanner(System.in);
    //validate  ko được phép nhập trùng id.,nhập số nguyên
        System.out.println("Enter the customer id: ");
            while (true){
                while (true){
                    try {
                        id = Integer.parseInt(sc.nextLine());
                        break;
                    }catch (Exception e){
                        System.err.println("Enter the integer:");
                    }
                }
                boolean isFind = false;
                for (Person person : peopleList) {
                    if (id == person.getId()) {
                        isFind = true;
                        break;
                    }
                }
                if (!isFind){
                    break;
                }else {
                    System.err.println("Id already exists.");
                }
            }
        // y/c nhập tên ko có khoảng trắng và giá trị null
        System.out.println("Enter the customer name: ");
            while (true){
                String _name = sc.nextLine();
                boolean check = setName(_name);
                if (check){
                    break;
                }
            }
        //nhập định dạng dưới dạng MM//dd//yyyy
        System.out.println("Enter the invoice date: ");
            while (true){
                try {
                    date = sc.nextLine();
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    sdf.parse(date);
                    break;
                }catch (Exception e) {
                    System.err.println("Input MM/dd/yyyy.");
                }
            }
        //type: đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất)
        System.out.println("Enter the customer audience: ");
            type = sc.nextLine();
        // số điện tiêu thụ nhập phải >0 và không được phép nhập ký tự (nhập số)
        System.out.println("Enter the electricity consumed: ");
        while (true){
            float _kw;  //biến chung gian kiểm tra true mới truyền vào setkw
            while (true){
                try{
                    _kw = Float.parseFloat(sc.nextLine());
                    break;
                } catch (Exception e){
                    System.err.println("Enter the float");
                }
            }
            boolean check = setKw(_kw);
            if (check){
                break;
            }
        }
        //y/c Nhập đủ 10 số.
        System.out.println("Enter your phone number: ");
//        while (!setPhone(sc.nextLine()));
        while (true){
            String _phone = sc.nextLine();
            boolean check = setPhone(_phone);
            if (check){
                break;
            }
        }
        //Số dư trong tk luôn >=0 và ko nhập ký tự;
        System.out.println("The amount in the account: ");

        while (true){
            double _wallet;
            while (true){
                try {
                    _wallet = Double.parseDouble(sc.nextLine());
                    break;
                } catch (Exception e){
                    System.err.println("Enter the integer");
                }
            }
            boolean check = setWallet(_wallet);
            if (check){
                break;
            }
        }
    }

    //Tạo hàm hiển thị
    public void display(){
        System.out.printf("%-20d %-20s %-20s %-20s %-20f %-20s %-20f", id, name, type, date, kw, phone, wallet);
    }

    public void displayPay(){

    }

}
