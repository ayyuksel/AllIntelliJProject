package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your gender");
        String gender = scan.next();


        System.out.println("Enter your age?");
        int age = scan.nextInt();


        System.out.println("Enter you full name");
        scan.nextLine();
        String fullName= scan.nextLine();


        System.out.println("Enter your zip code");
        String zipCode=scan.next();

        System.out.println("Enter country name?");
        scan.nextLine();
        String countryName =scan.nextLine();

        System.out.println("Enter your salary?");
        double salary =scan.nextDouble();

        System.out.println("Enter your company?");
        scan.nextLine();
        String companyName= scan.nextLine();

        System.out.println("enter your address");
        String address =scan.nextLine();
    }
}
