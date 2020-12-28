package day18_String_Continue;

import java.util.Locale;
import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an Apple product name");
        String product = scan.nextLine();
        product=product.replace(" ","").toLowerCase();

        switch (product){
            case "macbook":
                System.out.println("Which model of macbook would you like");
                String model = scan.nextLine();
                if(model.equalsIgnoreCase("air")){
                    System.out.println("Macbook Air is $2400");
                }else if(model.equalsIgnoreCase("pro")){
                    System.out.println("MacBook Pro is $2500");
                }else{
                    System.out.println("Invalid model");
                }
                break;
            case "iphone":
                System.out.println("Which model of Iphone would you like");
                String model2 = scan.nextLine().toLowerCase();
                if(model2.equals("12")){
                    System.out.println("Iphone 12 is $1000");
                }else if(model2.equals("11")){
                    System.out.println("Iphone 11 is $900");
                }else if(model2.equals("10")){
                    System.out.println("Iphone 10 is $800");
                }else if(model2.equals("8")){
                    System.out.println("Iphone 8 is $800");
                }else{
                    System.out.println("Invalid iphone model");
                }
                break;
            case "ipad":
                System.out.println("Which model of Ipad");
                String model3 = scan.nextLine();
                switch (model3){
                    case "air":
                        System.out.println("Ipad air is $500");
                        break;
                    case "pro":
                        System.out.println("Ipad pro is $400");
                        break;
                    case "mini":
                        System.out.println("ipad mini is $300");
                    default:
                        System.out.println("invalid model o ipad");
                }
                break;
            default:
                System.out.println("Invalid product name");
        }




    }
}
