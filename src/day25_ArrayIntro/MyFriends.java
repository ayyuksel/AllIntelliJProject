package day25_ArrayIntro;

import java.util.Scanner;

public class MyFriends {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many friend do you have?");
        int  number = scan.nextInt();

        String [] firstName = new String [number];
        String [] lastName = new String [number];
       // loop is for storing names
        for(int i = 0; i< number; i++){
            System.out.println("Enter first name?");
            String f = scan.next();

            f=f.substring(0,1).toUpperCase()+f.substring(1).toLowerCase();
            firstName[i]=f;
            System.out.println("Enter last name");
            String l = scan.next();
            //you need give format before you store the array
            l=l.substring(0,1).toUpperCase()+l.substring(1).toLowerCase();
            lastName[i]=l;
        } // the loop is used for initializing the arrays

       for(int i = 0; i<number; i++){
           System.out.println(firstName[i]+" "+lastName[i]);
       }





    }
}
