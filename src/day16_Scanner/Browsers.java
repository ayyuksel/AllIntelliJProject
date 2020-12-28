package day16_Scanner;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the browser type?");
        String browser = scan.nextLine();
        scan.close();


        switch (browser){
            case "chrome":
                System.out.println("Chrome is opening");
                break;
            case "firefox":
                System.out.println("Firefox is opening");
                break;
            case "opera":
                System.out.println("Opera is opening");
                break;
            case "Safari":
                System.out.println("Safari is opening");
                break;
            case "Internet Explorer":
                System.out.println("IE is opening");
                break;
            default:
                System.out.println("Invalid browser");
        }




    }
}
