package Assignment12;

import java.util.ArrayList;
import java.util.Scanner;

public class FGPerson extends Person {
    private String nation;
    private String nationalId;

    public FGPerson() {
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public void inputInfo(ArrayList<Person> peopleList) {
        Scanner sc = new Scanner(System.in);

        super.inputInfo(peopleList);
        System.out.println("Enter the country name: ");
        nation = sc.nextLine();

        System.out.println("Enter the country code: ");
        nationalId = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%-20s %-20s", nation, nationalId);
        System.out.printf("%.2f", invoice());
    }

    @Override
    public float invoice() {
        if (getKw() <= quota){
            return (float)(getKw() * price * 2.5);
        }else {
            return (float)(price * quota + (getKw() - quota) * price * 1.5 * 2.5);
        }
    }

    @Override
    public float pay() {
        return (float) (getWallet() - invoice());
    }

    @Override
    public String retrievePhoneNumber() {
            return "+00" + getPhone();
    }

    //Hàm hiển thị Só điện thoại sau lấy lại + số tiền trong tk nh + số tiền điện + số dư tk sau thanh toán
    @Override
    public void displayPay(){
        super.displayPay();
        System.out.printf("%-20s %-20f %-20f %-20f", retrievePhoneNumber(), getWallet(), invoice(), pay());
        if (pay() >=0){
            System.out.printf("%-20s","Payable account");
        }else {
            System.out.printf("%-20s", "The account does not have enough money");
        }
    }
}
