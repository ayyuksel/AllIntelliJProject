package day41_Encapsulation;

public class Data {
    //2A
    public static String publicVariable = "A";
    protected static String protectedVariable="D";
    private  static String privateVariable="B";
    static String defaultVariable ="C";




    private Data(){

    }

   public static void publicMethod(){
       System.out.println("Public metehof");
   }

   private static void privateMethod(){
       System.out.println("private method");
   }

    static void defaultMethod(){
        System.out.println("default method");
    }








}
