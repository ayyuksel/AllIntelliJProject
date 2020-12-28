package JavaProgramming2020_B21.src.day22_JavaRecap;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        //create substring from string
        //substring(beg, end);creates substring from beginning index till the giving index(excluded)
        //substring (beg): creates the substring from beginning to end

        String sentence = "My name is Ayse";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        String name2 = sentence.substring(11);
        System.out.println(name2);

        String str1 = "Monday is cool, it is a fun day";

        String day = str1.substring(0,6);
        System.out.println(day);


        String day2 = str1.substring(0, str1.indexOf(" "));
        System.out.println(day2);


        String s = "https://www.amazon.com";


        String domain = s.substring(s.lastIndexOf(".")+1);
        System.out.println(domain);

        String name3 = s.substring(s.indexOf(".")+1, s.lastIndexOf("."));

        System.out.println(name3);
        name3=name3.substring(0,1).toUpperCase()+name3.substring(1);
        System.out.println(name3);


        System.out.println("=================================");

        Scanner scan = new Scanner(System.in);
        String firstName =scan.nextLine().toLowerCase().replace(" ","");
        String lastName= scan.nextLine().toLowerCase().replace(" ","");

       firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);



        String fullName=firstName+" "+lastName;

        System.out.println("fullName = " + fullName);










    }
}
