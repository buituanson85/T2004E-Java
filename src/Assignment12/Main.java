package Assignment12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void showMenu(){
        System.out.println("==============Enter electricity bill payment information===============");
        System.out.println("1.Enter information of Vietnamese customers");
        System.out.println("2.Call and collect a series of electricity bills from customers");
        System.out.println("0.Finish importing changes to display");
        System.out.println("3.Exit");
        System.out.println("========================================================================");
    }

    static void showMenuPay(){
        System.out.println("=======================Display customer information=====================");
        System.out.println("1.In the Customer details information and the moneyization information");
        System.out.println("2.Enter information of foreign customers");
        System.out.println("3.Average revenue from foreign customers");
        System.out.println("4.Back to the information entry page");
        System.out.println("========================================================================");
    }
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        ArrayList<FGPerson> fgPeopleList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice,choicePay;

        do {
            VNPerson vnPerson = new VNPerson();
            FGPerson fgPerson = new FGPerson();
            showMenu();
            while (true){
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e){
                    System.err.println("Enter the integer");
                }
            }
            switch (choice){
                case 1:
                    vnPerson.inputInfo();
                    vnPerson.invoice();
                    peopleList.add(vnPerson);
                    System.out.println("You have finished importing");
                    break;
                case 2:
                    fgPerson.inputInfo();
                    peopleList.add(fgPerson);
                    fgPeopleList.add(fgPerson);
                    System.out.println("You have finished importing");
                    break;
                case 0:
                    do {
                        showMenuPay();
                        while (true){
                            try {
                                choicePay = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (Exception e){
                                System.err.println("Enter the integer");
                            }
                        }
                        switch (choicePay) {
                            case 1 -> {
                                System.out.println("Customers save detailed and electric bill information: ");
                                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s",
                                        "Id", "Name", "Type", "Date", "Kw", "Phone Number", "Wallet", "Nation", "NationalId", "Electric bill");
                                System.out.println();
                                for (Person person : peopleList) {
                                    person.display();
                                    person.invoice();
                                    System.out.println();
                                }
                            }
                            case 2 -> {
                                //hiển thị Só điện thoại sau lấy lại + số dư tk nh + số tiền điện + số dư tk sau thanh toán + kiểm tra

                                System.out.printf("%-15s %-15s %-15s %-15s %-15s", "PhoneNumber", "Wallet", "Invoice", "Pay", "Result");
                                System.out.println(" ");
                                for (Person person : peopleList) {
                                    person.displayPay();
                                    System.out.println(" ");
                                }
                            }
                            case 3 -> {
                                System.out.println("Average revenue from foreign customers.");
                                float averageRevenue;
                                float sum = 0;
                                int count = 0;
                                for (FGPerson person : fgPeopleList) {
                                    sum += person.invoice();
                                    count++;
                                }
                                if (count != 0) {
                                    averageRevenue = sum / count;
                                    System.out.println("Total: " + averageRevenue);
                                } else {
                                    System.err.println("Does not exist outside the row");
                                }
                            }
                            case 4 -> System.out.println("Back to the import page.");
                            default -> System.err.println("Choosing the wrong");
                        }
                    }while (choicePay != 4);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("Choosing the wrong");
                    break;
            }

        }while (choice != 3);
    }
}
