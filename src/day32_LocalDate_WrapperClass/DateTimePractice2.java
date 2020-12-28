package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class DateTimePractice2 {
    public static void main(String[] args) {
        LocalDate DofB = LocalDate.of(1984,2,3);
        int age1 = LocalDate.now().minusYears(10).getYear()-DofB.getYear();
        System.out.println(age1);




        LocalDate dateOfBirth = LocalDate.of(2010,8,17);
        int currentAge=LocalDate.now().getYear()-dateOfBirth.getYear();

        if(currentAge>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            LocalDate eligible = LocalDate.of(LocalDate.now().plusYears(21-currentAge).getYear(),
                    dateOfBirth.getMonthValue(),dateOfBirth.getDayOfMonth());
            System.err.println("You will buy alcohol: "+eligible);

        }


    }
}
