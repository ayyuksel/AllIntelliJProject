package day20_ForLoop;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i--) {
            if (i < 1) {
                break;//exits the loop immedietly
            }
            System.out.println("Hello");
        }

        System.out.println("=============================");

        for (int i = 0; i == 0; ) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers");

            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println("Sum: "+ (n1+n2) );

            /*System.out.println("Enter a math operator");
            char op = scan.next().charAt(0);

            switch (op){

            }*/


            System.out.println("Sum is: " + (n1 + n2));
            System.out.println("would you like to continue? yes or no");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }

        }


    }
}
