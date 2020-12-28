package day15_Scanner;

public class ExtraTaskSolution {
    public static void main(String[] args) {

        String houseType = "Villa";
        int houseMaxOccupants = 0;

        switch (houseType) {
            case "Tree house":
                houseMaxOccupants = 1;
                break;
            case "Mobile home":
                houseMaxOccupants = 2;
                break;
            case "Apartment":
                houseMaxOccupants = 4;
                break;
            case "Town house":
                houseMaxOccupants = 6;
                break;
            case "Villa":
                houseMaxOccupants = 8;
                break;
            case "Mansion":
                houseMaxOccupants = 10;
                break;
            default:
                System.out.println("Invalid house type");
        }

        System.out.println("houseMaxOccupants = " + houseMaxOccupants);

        System.out.println("====================================");
        char letter = 'e';

        if (letter >= 65 && letter <= 99) {
            System.out.println(letter + " is upper case");
        } else if (letter >= 97 && letter <= 122) {
            System.out.println(letter + " is lowercase");
        } else {
            System.out.println("Not a valid letter");
        }
        System.out.println("========================================");
        int numOne = 1;
        int numTwo = 5;
        int numThree = 9;
        boolean check = false;
        int finalResult = 0;

        if (numOne % 2 == 0) {
            numOne *= 5;
        } else {
            numOne *= 10;
        }

        if (numThree % 5 == 0) {
            numOne /= 5;
        } else {
            numThree /= 2;
        }

        if (check) {
            finalResult = numOne + numTwo + numThree;
            if (finalResult % 10 == 0) {
                System.out.println(finalResult);
            } else {
                System.out.println("Invalid result");
            }
        } else {
            finalResult = numOne * numTwo * numThree;
            if (finalResult % 2 == 1) {
                System.out.println(finalResult);
            } else {
                System.out.println("Invalid result");
            }
        }

        System.out.println("===========================");

        long longNum = 34241;

        if (longNum > 0 && longNum < 10) {
            System.out.println("1 digit");
        } else if (longNum >= 10 && longNum < 100) {
            System.out.println("2 digits");
        } else if (longNum >= 100 && longNum < 1000) {
            System.out.println("3 digits");
        } else if (longNum >= 1000 && longNum < 10000) {
            System.out.println("4 digits");
        } else if (longNum >= 10000 && longNum < 100000) {
            System.out.println("5 digits");
        } else {
            System.out.println("Invalid number");
        }

        System.out.println("============================================================================");
        byte gradeLevel = 12;

        switch (gradeLevel) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Elementary school");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Middle school");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("High school");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                System.out.println("College");
                break;
            case 17:
            case 19:
                System.out.println("Grad School");
                break;
            default:
                System.out.println("Invalid grade level");
        }


    }
}
