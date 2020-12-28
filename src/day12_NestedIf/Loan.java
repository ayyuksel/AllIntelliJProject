package day12_NestedIf;

public class Loan {
    public static void main(String[] args) {
        double salary = 50000;
        int jobHistory = 2;
        int creditScore =500;




        if (salary >= 30000) {
            if (jobHistory >= 2) {
                if(creditScore>=600) {
                    System.out.println("You are eligible for loan");
                }else{
                    System.out.println("you must have 600 credit score");
                }
            } else {
                System.out.println("You must have 2 years experience");
            }

        } else {
            System.out.println("You must have salary 30K");
        }


    }
}
