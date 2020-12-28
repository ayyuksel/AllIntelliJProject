package day26_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many would you like to enter?");
        int length = scan.nextInt();

        int [] numbers = new int [length];
        int sum=0;

        for(int i = 0; i<=numbers.length-1; i++){
            System.out.println("Enter a number?");
            numbers[i]=scan.nextInt();
            sum+=numbers[i];
        }
        double average =(double)sum/length;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);




    }
}
