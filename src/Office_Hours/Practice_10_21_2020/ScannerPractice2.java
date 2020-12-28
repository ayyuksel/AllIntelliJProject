package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice2 {
    //nextDouble(): double
    //next(): String, only take first word
    //nextLine(): String, takes all everything even Enter keyword
    //we need extra nextLine(); whenever need use nextLine(); after another Scanner method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a price");
        double price = scan.nextDouble();

        System.out.println(price);

        System.out.println("Enter name of the item?");
        String item=scan.next();
        System.out.println("Item: "+item);

        System.out.println("Enter your full name?");
        scan.nextLine();
        String fullName=scan.nextLine();
        scan.close();
        System.out.println(fullName);




    }
}
