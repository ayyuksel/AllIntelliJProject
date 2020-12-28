package day18_String_Continue;

import java.util.Scanner;

public class SubStringMethod {
    public static void main(String[] args) {
        //substring() exclude last index always
        //length()-1 give you last index
        //length()-1+1 include last index in substring method
        String str = "today is Monday";
        str = str.substring(9, 15);
        System.out.println("str = " + str);

        String email = "cybertek@gmail.com";
        String domain = email.substring(9,13+1);

        System.out.println("domain = " + domain);

        System.out.println("===========================");

        String s1 ="I like movies and books";
        //          01234567891112
        String word =s1.substring(7,12+1);
        System.out.println("word = " + word);

        System.out.println("==================================");

        String firstName ="mArWaN";
        String firstChar=firstName.substring(0,1).toUpperCase();
        String rest = firstName.substring(1, firstName.length()-1+1).toLowerCase();

        firstName=firstChar+rest;
        System.out.println(firstName);

        System.out.println("========================================");

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first name");
        String f =scan.nextLine();

        System.out.println("Enter your last name");
        String l= scan.nextLine();

        f=f.substring(0,1).toUpperCase() + f.substring(1,f.length()).toLowerCase();

        l=l.substring(0,1).toUpperCase()+l.substring(1,l.length()-1+1).toLowerCase();


        System.out.println("first name is "+f);
        System.out.println("last name = " + l);
        String fullName =f+l;
        System.out.println("fullName = " + fullName);
















    }
}
