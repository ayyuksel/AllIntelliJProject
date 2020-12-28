package day14_Switch_Recap;

public class SalaryCalculator {


        public static void main(String[] args) {
            int hourlyRate = 60;
            int weeklyHours = 60;
            int numberOfWeeks = 50;

            int salary = 0;

            if (hourlyRate > 0) {

                if (weeklyHours > 1 && weeklyHours <= 65) {

                    if (numberOfWeeks > 1 && numberOfWeeks <= 52) {

                        salary = hourlyRate * weeklyHours * numberOfWeeks;
                        System.out.println("Your salary is: " + salary);

                    } else {
                        System.err.println("number of weeks cannot be less than 1 or greater than 52");
                    }

                } else {
                    System.err.println("Weekly Hours cannot be less than 1 or greater than 65");
                }

            } else {
                System.err.println("Hourly Rate cannot be Negative or 0");
            }



        }
}
