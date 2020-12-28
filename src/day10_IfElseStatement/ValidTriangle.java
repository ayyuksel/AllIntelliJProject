package day10_IfElseStatement;

public class ValidTriangle {
    public static void main(String[] args) {
        double angle1 = 60;
        double angle2 = 30;
        double angle3 = 90;


        boolean isValid =(angle1+angle2+angle3)==180;
        if(isValid){
            System.out.println("It is a valid triangle");
        }
        if(!isValid){
            System.out.println("It is not valid triangle");
        }





    }
}
