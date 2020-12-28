package Office_Hours.Practice_10_21_2020;
import java.util.Scanner;
public class ScannerPractice {
    //Scanner : used for getting user input
    //import statement use for importing sources from outside package
    //Scanner is class in Java system library
    //import PackageName.ClassName
    //package name: java.util.Scanner//import single class
    ////package name: java.util.*;//import all classes
    //How to use scanner class? --> By creating Scanner object
    //How can I can declare scanner?
    // Scanner scan = new Scanner(System.in);
    //methods of Scanner
    //nextInt();only expect integer
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");
        int score=scan.nextInt();
        scan.close();
        String grade="";

      if(score>=0 && score <=100){
           /*  if(score>=90) {
               grade = "A";
           }else if(score>=80){
               grade="B";
           }else if(score>=70){
               grade="C";
           }else if(score>=60){
               grade="D";
           }else if(score>=50){
               grade="F";
           }*/



          grade=(score>=90)?"Excellent":(score>=80)?"Great":(score>=70)?
                  "Good":(score>=60)?"Passed":"Fail";
        }else {
            grade="invalid";
        }



        System.out.println(grade);







    }







}
