package day32_LocalDate_WrapperClass;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Time {
    public static void main(String[] args) {
LocalTime t1 = LocalTime.of(2,50,50,300);
        System.out.println("t1 = " + t1);
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);


  //LocalDateTime
  LocalDateTime t2 = LocalDateTime.of(2100,2,3,1,30,55,3000);
        System.out.println("t2 = " + t2);

LocalDateTime t3 = LocalDateTime.now();
        System.out.println("now = " + t3);




    }
}
