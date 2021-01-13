package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String str = scan.next();
        //String str = "aaabcde";
        System.out.println("enter a character");
        char ch = scan.next().charAt(0);
        scan.close();
        //char ch ='b';

        int frequency = 0;
        //compare ch each character of String
//loop is finding frequency of one character and assigning to ch
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (ch == eachChar) {
                frequency++;
                //whenever ch ==eachChar frequency increase by one
            }
        }

        System.out.println(frequency);


    }
}
