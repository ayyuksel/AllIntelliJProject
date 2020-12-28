package day29_Methods;

import java.util.Scanner;

public class hCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        calculator(10, '+', 50);

        //  calculator(scan.nextDouble(),  scan.next().charAt(0), scan.nextDouble() );

    }
    public static void calculator(double n1, char operator,double n2){
        boolean isValid= operator == '+'|| operator == '-' || operator == '*'
                || operator=='/'||operator=='%';

        if(isValid){
            /*switch (operator){
                case '+':
                    System.out.println("addition: "+(n1+n2));
                    break;
                case '-':
                    System.out.println("subtraction:"+(n1-n2));
                    break;
                case '*':
                    System.out.println("multiplication: "+(n1*n2));
                    break;
                case '/':
                    System.out.println("division"+(n1/n2));
                    break;
                case '%':
                    System.out.println("remainder"+(n1%n2));

                    break;
            }*/
            System.out.println(
                    (operator=='+')?"addition: "+(n1+n2):( operator == '-')?"subtraction: "+(n1-n2):(operator=='*')?"multiplication"+(n1*n2):(operator=='/')?"division: "+(n1/n2):"remainder: "+(n1%n2)
            );

        }else{
            System.err.println("Invalid operator");
        }



    }
}
