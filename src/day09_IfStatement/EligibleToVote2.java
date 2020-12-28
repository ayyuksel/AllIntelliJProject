package day09_IfStatement;

public class EligibleToVote2 {
    public static void main(String[] args) {
        String name ="Daniel";
        boolean isUSACitizen = true;
        int age = 18;
        boolean hasCriminalBackground =false;

        boolean isEligible = isUSACitizen==true && age>=18 && hasCriminalBackground==false;

        System.out.println(name+" is eligible to vote: "+isEligible);


        System.out.println("============================================");

        String name2 = "John";
        String c1 = "Canade";
        String c2 = "USA";

        boolean eligible = c1 == "USA"|| c2 =="USA";

        System.out.println(name2+" is eligible t vote: "+eligible);










    }
}
