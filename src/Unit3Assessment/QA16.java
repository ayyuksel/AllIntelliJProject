package Unit3Assessment;

import java.util.Scanner;

public class QA16 {
    public static void main(String[] args) {
        double number = add(3.4);

        number+=add("dual");
        number+=add(Integer.parseInt("100"));
        number+=add(11341L);
        number+=add(Float.parseFloat("50.8"));
       System.out.println(number);
        System.out.println("==================================");
        Scanner input = new Scanner(System.in);
        int total=0;
        total+=action(input.nextBoolean());
        total+=action(input.nextInt());
        total+=action();
        total+=action(input.next());
        total+=action(input.next());
        System.out.println(total);







    }
    public static int add(int n) {
        return 5;
    }

    public static double add(double d) {
        return 2.5;
    }

    public static long add(String s) {
        return 10;
    }
    //=================================================
    //17
    public static int action(){
        return 0;
    }
    public static int action(int i){
        return i*2;
    }
    public static int action(String s){
        return s.length();
    }
    public static int action(boolean b){
        if(!b){
            return 5;
        }else {
            return 10;
        }
    }

}
