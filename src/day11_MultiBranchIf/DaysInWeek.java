package day11_MultiBranchIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 6;
        String day ="";

        if(number==1){
            day = "Monday";
        }else if(number == 2){
            day ="Tuesday";
        }else if(number==3){
            day = "wednesday";
        }else if(number==4){
            day = "Thursday";
        }else if(number==5){
            day= "Friday";
        }else if(number==6){
            day="Saturday";
        }else{
            day="Sunday";
        }
        System.out.println("Day is: "+day);

        System.out.println("=======================================");









    }
}
