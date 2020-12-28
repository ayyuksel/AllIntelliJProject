package JavaProgramming2020_B21.src.day22_JavaRecap;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min =2147483647;

        for(int i = 1 ; i <=0; i++){
            System.out.println("Enter a number");
            int num =scan.nextInt();
            if(num>min){
                min=num;
            }
        }

        System.out.println("min = " + min);



    }
}
