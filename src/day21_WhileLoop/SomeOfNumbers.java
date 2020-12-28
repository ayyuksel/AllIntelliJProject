package day21_WhileLoop;

import java.util.Scanner;

public class SomeOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result =0;


        for(int i = 0; true;) {
            System.out.println("Enter a number");
           int num = scan.nextInt();


            if(num<0){// if the user entered number is negative, it will not be added to teh result.
                break;
            }
            result+=num;
        }
        System.out.println("result = " + result);













    }
}
