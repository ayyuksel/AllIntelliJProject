package Office_Hours.Practice_11_26_2020;

import java.util.Scanner;

public class LoopsPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hourlyRate=0;
        int weeklyHour=0;
        String answer="";

        System.out.println("enter your hourlyRate");
        hourlyRate=scan.nextDouble();
        System.out.println("how many hours do you work in a week");
        weeklyHour=scan.nextInt();
        double salary =weeklyHour*hourlyRate*52;
        System.out.println("your salary: "+salary);
        double tax =salary*0.3;
        System.out.println("your tax : "+tax);
        double salaryAfterTax = salary-tax;
        System.out.println("your salary after tax: "+salaryAfterTax);

        System.out.println("would you like to continue?");
        answer=scan.next();


    }
}
