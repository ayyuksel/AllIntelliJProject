package day17_String;

import java.util.Scanner;

public class Scanner_Review2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name?");
        String product = scan.nextLine();



        System.out.println("Enter a price");
        double price = scan.nextDouble();

        System.out.println("Enter quantity");
        int quantity = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter full name");
        String fullName = scan.nextLine();

        System.out.println(product);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(fullName);
    }
}
