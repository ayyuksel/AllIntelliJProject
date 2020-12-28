package day17_String;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three letter word");
        String word = scan.next();

        if (word.length() == 3) {

            if (word.charAt(1) == 'a') {
                System.out.println("Cool word");
            } else {
                System.out.println("Not a cool world");
            }
        } else {
            if (word.length()<3){
                System.out.println("word is too short");
            }else{
                System.out.println("word is too long");
            }

        }
    }
}