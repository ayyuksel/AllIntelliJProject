package day12_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        String day = "";
        int number = -2;
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                day = "Monday";
            } else if (number == 2) {
                day = "Tuesday";
            } else if (number == 3) {
                day = "Wednesday";
            } else if (number == 3) {
                day = "Thursday";
            } else if (number == 5) {
                day = "Friday";
            } else if (number == 6) {
                day = "Saturday";
            } else {
                day = "sunday";
            }
        } else {
            day = "Invalid";
        }
        System.out.println("day = " + day);
    }
}
