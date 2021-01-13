package day45_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str = "Cybertek";
        try {
            System.out.println(str.substring(200, 300));

        } catch (StringIndexOutOfBoundsException e) {
            // System.out.println("StringIndexOutOfBoundsException is occurred");
            System.out.println(e.getMessage());
            e.printStackTrace();//gives what exception occur
        }


        try {
            Thread.sleep(5000);
            System.out.println("try block");
        } catch (InterruptedException e) {
            System.out.println("catch block");

        }
        try {
            System.out.println(100 / 0);
        }catch (RuntimeException e){//ArithmeticException
            System.out.println("Unchecks exception is occurred "+e.getMessage());
        }

        System.out.println("Test completed");

    }
}
