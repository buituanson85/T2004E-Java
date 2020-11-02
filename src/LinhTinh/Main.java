package LinhTinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void showMenu(){
        System.out.println("==============Enter electricity bill payment information===============");
        System.out.println("1.Enter information of Vietnamese customers");
        System.out.println("2.Call and collect a series of electricity bills from customers");
        System.out.println("3.In the Customer details information and the moneyization information");
        System.out.println("4.Enter information of foreign customers");
        System.out.println("5.Average revenue from foreign customers");
        System.out.println("6.Exit");
        System.out.println("========================================================================");
    }

    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        ArrayList<FGPerson> fgPeopleList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            VNPerson vnPerson = new VNPerson();
            FGPerson fgPerson = new FGPerson();
            showMenu();
                    choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    vnPerson.inputInfo();
                    vnPerson.invoice();
                    peopleList.add(vnPerson);
                    System.out.println("You have finished importing");
                }
                case 2 -> {
                    fgPerson.inputInfo();
                    peopleList.add(fgPerson);
                    fgPeopleList.add(fgPerson);
                    System.out.println("You have finished importing");
                }
                case 3 -> {
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
                case 4 -> {
                    System.out.printf("%-15s %-15s %-15s %-15s", "PhoneNumber", "Wallet", "Invoice", "Pay");
                    System.out.println(" ");
                    for (Person person : peopleList) {
                        person.displayPay();
                        System.out.println(" ");
                    }
                }
                case 5 -> {
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
                case 6 -> System.out.println("Back to the import page.");
                default -> System.err.println("Choosing the wrong");
            }
        }while (choice != 6);
    }
}
