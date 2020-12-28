package day25_ArrayIntro;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Sep","Oct","Nov","Dec"};

        System.out.println("Enter month?");
        int num = scan.nextInt();
        System.out.println(months[num-1]);


        String [] week = {"Mon","Tues","Wed","Thur","Fri","Sat","Sun"};
        System.out.println("Enter a day?");
        int num2 = scan.nextInt();
        System.out.println(week[num2-1]);
    }
}
