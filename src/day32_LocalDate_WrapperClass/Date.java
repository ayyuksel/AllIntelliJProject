package day32_LocalDate_WrapperClass;
import java.time.LocalDate;
public class Date {
    public static void main(String[] args) {
LocalDate yesterday =LocalDate.of(2020,11,22);

        System.out.println(yesterday);

        LocalDate d1 = LocalDate.of(2020,2,29);
        System.out.println("d1 = " + d1);
        System.out.println(yesterday.isLeapYear());


        LocalDate today = LocalDate.now();
        System.out.println(today);


        String[] names ={"Julia","Inna","Anna","Ruslan","Livio"};
        LocalDate []birthdays={
                LocalDate.of(1990,11,23),
                LocalDate.of(1995,2,10),
                LocalDate.of(2000,03,15),
                LocalDate.of(2005,4,20),
                LocalDate.of(2010,5,25),
        };



        for(int i=0; i<names.length; i++){
            System.out.println(names[i]+" "+birthdays[i]);
            System.out.println(names[i]+" was born leap year "+birthdays[i].isLeapYear()+"\n");
        }






    }

}
