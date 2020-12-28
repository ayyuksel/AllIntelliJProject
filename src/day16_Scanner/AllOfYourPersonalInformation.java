package day16_Scanner;

import java.util.Scanner;

public class AllOfYourPersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = 0;

        System.out.println("How many people do you live with");
        byte liveWithNumber = input.nextByte();

        if (liveWithNumber > 0 && liveWithNumber <= 12) {

            if (liveWithNumber <= 2) { // only be 1 or 2
                points++;
            } else if (liveWithNumber < 7) { // include 3 - 6
                points += 2;
            } else { // include 7 - 12
                points += 3;
            }

        } else {
            System.err.println("Not a valid number of people");
        }


        System.out.println("What city do you live in");
        input.nextLine();
        String city = input.nextLine();

        System.out.println("Do you live in downtown");
        String liveDownTown = input.next();
        if(liveDownTown.equalsIgnoreCase("yes")) {
            System.out.println("Have you thought about moving to the suburbs");
            String suburb = input.next();
            if(suburb.equalsIgnoreCase("yes")) {
                points++;
            } else {
                points--;
            }
        }

        System.out.println("what is your favorite animal");
        String animal = input.next();
        System.out.println("Wow, " + animal + " is a great animal");

        System.out.println("How many pets do you want");
        int pets = input.nextInt();
        System.out.println("Interesting, do you want " + pets + " " + animal + "s" );

        System.out.println("Points at the end: " + points);

    }
}
