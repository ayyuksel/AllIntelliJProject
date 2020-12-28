package day16_Scanner;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary?");
        double salary = input.nextDouble();

        System.out.println("enter your hour per week");
        int hours = input.nextInt();

        double hourlyRate = salary / (hours * 52);
        System.out.println("Your hourly rate is: "+hourlyRate);



    }
}
