package Day06_ArithmeticalOperators;

public class GallonToLiters {
    public static void main(String[] args) {
        double gallon = 120.5;
        double liters = gallon*3.78541;
        System.out.println(gallon+" gallon equal to "+liters+" L");


        boolean  exceeded300Liters = liters > 300;
        // the liters exceeds 300

        // 120.5 gallons exceeds 300 liters: true/false
        System.out.println(gallon +" gallons exceeds 300 liters: " + exceeded300Liters );

    }
}
