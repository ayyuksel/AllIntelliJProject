package day09_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name ="John";
        String citizen = "USA";
        boolean eligible = citizen =="USA";
        System.out.println(name+" is eligible to vote: "+eligible);

        System.out.println("===============================");


        String name2 = "Aaron";
        boolean isUSCitizen = true;
        boolean eligibleToVote= isUSCitizen==true;
        System.out.println(name2+" eligible  to vote "+eligibleToVote);
    }
}
