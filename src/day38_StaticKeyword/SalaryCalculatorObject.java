package day38_StaticKeyword;

public class SalaryCalculatorObject {
    public static void main(String[] args) {

            SalaryCalculator salary1 = new SalaryCalculator();
            salary1.setInfo(60, 40, 8,22);

            System.out.println(salary1);

            SalaryCalculator salary2 = new SalaryCalculator();
            salary2.setInfo(70, 40, 8,22);
        System.out.println(salary2);
            // ==

            System.out.println( salary1.equals(salary2)  );


        }

    }
