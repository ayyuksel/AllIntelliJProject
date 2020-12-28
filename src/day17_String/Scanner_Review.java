package day17_String;

import java.util.Scanner;

public class Scanner_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//make scanner object

        System.out.println("Pick number from 1 -10");
        byte num = scan.nextByte();
        if (num > 0 && num < 4) {

            System.out.println("Can you enter the number as a word");
            String word = scan.next();
            boolean areMatching =false;
            switch (word){
                case "one":
                    areMatching =(num==1);
                    break;
                case "two":
                    areMatching =(num==2);
                    break;
                case "three":
                    areMatching=(num==3);
                    break;
            }

            if(areMatching) {
                System.out.println("Number is: " + num);
                System.out.println("Word is: " + word);
            }else{
                System.out.println("two input are not matching");
            }
        } else {
            System.out.println(num + " was not between 1-3");
        }
    }
}