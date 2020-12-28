package day32_LocalDate_WrapperClass;

public class ParseMethods {
    public static void main(String[] args) {
        //Parse Methods: Converting String to Primitives
        //you need call the method from Wrapper Class


        System.out.println("Int===============================");

        String data1 = "123";
        System.out.println(data1 + 3);//1233

        int num = Integer.parseInt(data1);
        //primitive<====primitive==>none
        System.out.println(num + 4);
        Integer num2 = Integer.parseInt(data1);
        //wrapper<======primitive==>unboxing
        System.out.println(num2 + 10);
        System.out.println("double============================");
        String s2 = "2.5";
        double d1 = Double.parseDouble(s2);
        //primitive<=====primitive==>none
        Double d2=Double.parseDouble(s2);
        //wrapper<=====primitive====>autoboxing
        System.out.println(d1+2);
        System.out.println(d2+10);


        System.out.println("Boolean===============================");

        String s3= "true";
        boolean b1 =Boolean.parseBoolean(s3);//none
        Boolean b2= Boolean.parseBoolean(s3);//autoboxing
        System.out.println(b1);
        System.out.println(!b2);

        String s4= "TRue";//parse methods does not cate about case sensitive
        boolean r1 = Boolean.parseBoolean(s4);
        System.out.println(r1);






    }
}
