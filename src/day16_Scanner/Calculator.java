package day16_Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number one ");
        double numberOne = scan.nextDouble();

        System.out.println("Enter number two");
        double numberTwo = scan.nextDouble();

        System.out.println("Enter the operator");
        String operator =scan.next();
        scan.close();
        double result = 0;
        boolean isValid =true;
        switch (operator){
            case "+":
            case "plus":
             result=numberOne +numberTwo;
             break;
            case "-":
                result=numberOne-numberTwo;
                break;
            case "*":
            case "x":
                result=numberOne*numberTwo;
                break;
            case "/":
                result=numberOne/numberTwo;
                break;
            case "%":
                result=numberOne%numberTwo;
            default:

                isValid =false;
        }

        if(isValid){
            System.out.println(numberOne+ " "+operator+"  "+numberTwo+ " = "+result);
        }else{
            System.out.println("invalid");
        }


    }
}
