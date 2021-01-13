package day45_Exceptions;

import java.time.LocalDate;
import java.time.LocalTime;

public class EveryDaysLunchBreak {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime lunchTime = LocalTime.of(1,60);
        if(currentTime.equals(lunchTime)){
            throw new LunchBreakException("Lunch break");
        }else {
            System.out.println("continue");
        }
    }
}
