package day15_Scanner;

import java.util.Scanner;

public class Scanner_Decimal {
    public static void main(String[] args) {
        Scanner decimal = new Scanner(System.in);
        System.out.println("Enter a fload number");
        float f = decimal.nextFloat();
        System.out.println("Number is "+f);

        System.out.println("Enter a double number");
        double d = decimal.nextDouble();
        System.out.println("Number is : "+d);
        System.out.println(decimal.nextFloat()+decimal.nextDouble());

    }
}
