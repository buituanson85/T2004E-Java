package Practical_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HashMap {
    static void showMenu(){
        System.out.println("1.Add new customer");
        System.out.println("2.Find by name");
        System.out.println("3.Display all");
        System.out.println("4.Exit.");
        System.out.println("Choose: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Customer> customersList = new ArrayList<>();
        int choose;

        do {
            showMenu();
            while (true){
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    break;
                }catch(NumberFormatException e){
                    System.err.println("Choose must be number !!!");
                }
                catch (Exception e) {
                    System.err.println(e.getMessage());
                    sc = new Scanner(System.in);
                }
            }
            switch (choose){
                case 1:
                    System.out.println("Enter the number of customers to add  : ");
                    int n;
                    while (true){
                        try {
                            n = Integer.parseInt(sc.nextLine());
                            break;
                        }catch(NumberFormatException e){
                            System.err.println("Choose must be number !!!");
                        }
                        catch (Exception e) {
                            System.err.println(e.getMessage());
                            sc = new Scanner(System.in);
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        Customer customer = new Customer();
                        customer.input();
                        customersList.add(customer);
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the customer to search ");
                    String name = sc.nextLine();

                    for (Customer search : customersList) {
                        if(search.getName().equalsIgnoreCase(name)) {
                            System.out.format("%-20s %-20s %-20s", "Name", "Email", "Phone");
                            System.out.println(" ");
                            search.display();
                        }else
                            System.err.println("does not exist");
                    }
                    break;
                case 3:
                    System.out.format("%-20s %-20s %-20s", "Name", "Email", "Phone");
                    System.out.println(" ");
                    for (Customer customer : customersList) {
                        customer.display();
                    }
                    break;
                case 4:
                    System.out.println("Exit.");
                    break;
                default:
                    System.err.println("Invalid entry!!!");
                    break;
            }

        }while (choose != 4);
    }
}
