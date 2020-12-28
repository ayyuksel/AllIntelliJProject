package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //salary: 100000, taxRate: 0.28;

        int salary = 100000;
        double taxRate=0.28;
        double totalTax=salary*taxRate;
        double salaryAfterTax=salary-totalTax;
        System.out.println("Total tax will be;");
        System.out.println(totalTax);

        System.out.println("Your salary will be : ");
        System.out.println(salaryAfterTax);



    }
}
