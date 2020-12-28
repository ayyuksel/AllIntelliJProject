package day18_String_Continue;

import java.util.Scanner;

public class SubstringMethod2 {
    public static void main(String[] args) {
        String str = "Today is Monday";

        String day = str.substring(9);
        System.out.println("day = " + day);

        System.out.println("==========================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname = scan.next();//"cyBeRTek";
        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        System.out.println("firstname = " + firstname);

        System.out.println("Enter a last name");
        String lastName = scan.next();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);
        String fullName = firstname +" "+lastName;
        System.out.println("fullName = " + fullName);
    }
}
