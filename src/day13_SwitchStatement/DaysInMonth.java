package day13_SwitchStatement;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2020;
        int month = 7;

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        String result = "";

        if (month > 0 && month < 13) {
            if (has28Days) {
                if (year % 4 == 0) {
                    result = "29 days";
                } else {
                    result = "28 days";
                }
            } else if (has30Days) {
                result = "30 days";
            } else {
                result = "31 days";
            }


        } else {
            result = "Invalid month";
        }
        System.out.println("result = " + result);

    }
}
