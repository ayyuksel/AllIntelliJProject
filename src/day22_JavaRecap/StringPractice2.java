package JavaProgramming2020_B21.src.day22_JavaRecap;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String f= scan.nextLine();
        System.out.println("Enter last name: ");
        String l= scan.nextLine();

        String fullName=f.substring(0,1).toUpperCase()+"."+l.substring(0,1).toUpperCase();


        System.out.println(fullName);










    }
}
