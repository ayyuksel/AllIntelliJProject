package day32_LocalDate_WrapperClass;

public class ValueOfMethods {
    public static void main(String[] args) {
        //Parse Methods: Converting String to Wrapper Class
        //you need call the method from Wrapper Class
        System.out.println("Integer===========================");
        String s1 ="123";
        int num1 = Integer.valueOf(s1);//unboxing
        //primitive <====wrapper
        Integer num2 = Integer.valueOf(s1);//none
        //wrapper <=====wrapper

        System.out.println(num1+2);
        System.out.println(num2+7);


        System.out.println("double==============================");


        String s2 = "2.5";
        double d1 =Double.valueOf(s2);//unboxing
        Double d2=Double.valueOf(s2);//none
        System.out.println(d2+1);

        System.out.println("Boolean==============================");

        String s3 = "True";//value of method is not case sensitive
        boolean b1 =Boolean.valueOf(s3);//unboxing
        System.out.println(!b1);

        System.out.println("max && min value========================");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);



    }
}
