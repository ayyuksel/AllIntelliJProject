package day07_UnaryOperators;

public class LeapYear {
    public static void main(String[] args) {
        int year =2020;
        boolean isLeapYear = year % 4 < 1;

        System.out.println(year+" is leap year:"+isLeapYear);
    }
}
