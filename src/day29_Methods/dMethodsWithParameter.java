package day29_Methods;

public class dMethodsWithParameter {
    public static void main(String[] args) {
        int age = 35;
        eligibleToBuyAlcohol(age);
        eligibleToBuyAlcohol(23);
        calculateAge(1980, 2020);
        calculateAge(2050,2020);
    }
//if method pass parameter, we must give argument method when we call it
    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static void calculateAge(int birthYear, int currentYear) {
        if (birthYear < currentYear) {
            System.out.println("Your age is: " + (currentYear - birthYear));
        }else{
            System.out.println("Invalid");
        }
    }
}