package day18_String_Continue;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
       String str = "Cybertek";

       str=str.concat(" School");

        System.out.println(str);

        String str2 = "Cybertek";
        str2=str2+" School";
        str2=str2+123;
        System.out.println(str2);

        System.out.println("==============================");

        String name ="bank of America";
        name=name.toUpperCase();
        System.out.println("name = " + name);

        name=name.toLowerCase();
        System.out.println("name = " + name);

        System.out.println("=================================");

        String t1 = "              Hello";
        t1=t1.trim();
        System.out.println(t1);


        String t2 = "             Hello Everyone";
        t2=t2.trim();
        System.out.println(t2);

        System.out.println("===============================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");

        String firstName = scan.nextLine();
        System.out.println("Enter last name");
        String lastName =scan.nextLine();
        lastName=lastName.trim();
            firstName=firstName.trim();
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
    }
}
