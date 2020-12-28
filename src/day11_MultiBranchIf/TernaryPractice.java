package day11_MultiBranchIf;

public class TernaryPractice {
    public static void main(String[] args) {
        int n =100;
        String result ="";
        if(n%2==0){
            result ="Even";
        }else{
            result ="Odd";
        }

        System.out.println(result);
        System.out.println("============================");
        String result2 = (n%2==0)?"Even":"Odd";
        System.out.println(result2);


        System.out.println("=========================");
        int age = 25;
        String citizenShip = "USA";
        String eligibleToVote = (age >= 18 && citizenShip == "USA")?"Eligible to vote":"Not eligible to vote";
        System.out.println(eligibleToVote);

        System.out.println("===========================================");
        int age2 = 18;

        String buyAlcohol = (age2 >=21 )? "Eligible to by alcohol":"Not eligible to buy alcohol";

        System.out.println(buyAlcohol);

        System.out.println("======================================");

        int number =100;
        String s1 = "";

        if(number>0){
            s1="Pozitive";
        }else if(number<0){
            s1="Negative";
        }else {
            s1="Zero";
        }

        System.out.println(s1);

        String s2 = (number>0)?"Positive":(number<0)?"Negative":"Zero";




    }
}
