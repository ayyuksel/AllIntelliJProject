package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    public static void main(String[] args) {
        /*
        year : yyyy= full year yy = last 2 numbers of year
        month : MM(number), MMM(three letter of month), MMMM(full name of month)
        days: dd
        name of day: E(three letter),EEEE(full name)

        LocalTime:
        hours:hh
        minutes: mm
        seconds: ss
        am/pm: a





         */
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE");

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        System.out.println("today = " + today.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh,mm,ss,a");
        LocalTime now= LocalTime.now();
        System.out.println("now = " + now);
        System.out.println("now= " + now.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a MMM/dd/yyyy");
        LocalDateTime dt1 = LocalDateTime.of(2020,11,23,10,20,30,3000);
        System.out.println("dt1 = " + dt1);
        System.out.println(dt1.format(dtf));

        LocalDate tomorrow = LocalDate.of(2020,11,24);
        System.out.println(tomorrow.format(df));

        boolean r1 = today.isBefore(tomorrow);
        boolean r2 = today.isAfter(tomorrow);
        System.out.println(r1);
        System.out.println(r2);

        int currentYear = LocalDate.now().getYear();
        LocalDate DofB = LocalDate.of(2000,5,19);
        int age = currentYear-DofB.getYear();
        System.out.println(age);

        LocalDate rightNow = LocalDate.now();
        LocalDate holidayBreak = rightNow.plusDays(2);
        System.out.println(holidayBreak);



        LocalTime time = LocalTime.now();
        LocalTime lunchBreak = time.plusMinutes(15);
        System.out.println("lunchBreak = " + lunchBreak);



        LocalTime classStarts = LocalTime.of(10,0);
        LocalTime firstBreak =classStarts.plusMinutes(45);
        System.out.println(firstBreak);

        LocalTime secondBreak= firstBreak.plusMinutes(15).plusMinutes(45);
        System.out.println(secondBreak);

        LocalTime thirdBreak = secondBreak.plusMinutes(15).plusMinutes(45);
        System.out.println(thirdBreak.format(tf));


    }
}
