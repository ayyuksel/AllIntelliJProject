package day14_Switch_Recap;

public class DaysInMonth {
    public static void main(String[] args) {
        int year =2000;
        String month = "Fe";
        String result = "";

        switch (month){
            case "Jan":
                result="31 days";
                break;
            case "Feb":result=(year%4==0)?"29 days":"28 days";
                break;
            case "Mar":
                result="31 days";
                break;
            case "Apr":
                result="30";
                break;
            case "May":
                result="31 days";
                break;
            case "Jun":
                result="30";
                break;
            case "Jul":
                result="31 days";
                break;
            case "Aug":
                result="31";
                break;
            case "Sep":
                result="30";
                break;
            case "Oct":
                result="31 days";
            case "Nov":
                result="30";
                break;
            case "Dec":
                result="31";
            default:result="no such a month";
        }
        System.out.println(result);
    }
}
