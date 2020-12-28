package day18_String_Continue;

import java.util.Scanner;

public class SubstringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String str = scan.next();
        String str2 =scan.next();

        String result = str.substring(1,str.length())+str2.substring(1,str.length());
        System.out.println("result = " + result);

    }
}
