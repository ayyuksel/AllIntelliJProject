package Day06_ArithmeticalOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
    /*  double salary = 100000;
      double stateTaxRate=0.08;
      double federalTaxRate=0.21;

      double stateTax= salary * stateTaxRate;
      double federalTax= salary *federalTaxRate;
      double totalTax = stateTax +federalTax;


      double salaryAfterTax=salary-totalTax;

        */

double salary =100000, stateTaxRate =0.08,federalTaxRate=0.21,
        stateTax= salary * stateTaxRate,federalTax= salary *federalTaxRate,
        totalTax = stateTax +federalTax,salaryAfterTax=salary-totalTax;
        System.out.println("Your salary is: $"+salary);
        System.out.println("Your state tax is : $"+stateTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("Salary after tax: $"+salaryAfterTax);





    }
}
