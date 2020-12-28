package day08_ShortHand_Relatinal;

public class GallonsToLiters {
    public static void main(String[] args) {
        int gallons = 100;
        double liters = gallons*3.378;
        int result = (int) liters;

        System.out.println(gallons+" gallons equal to "+result+" liters");

    }
}
