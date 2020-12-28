package day07_UnaryOperators;

public class UnaryOperator {
    public static void main(String[] args) {
        int a =100;
        boolean positive  = a > 0;//verify a is positive
        boolean negative = a< 0;// verify a is negative

        System.out.println(a+" is positive number "+positive);
        System.out.println(a+" is negative number "+negative);

        int b = -100-20;
        System.out.println(b);

        int c = 10- -20;
        //30
        int d = -10*4;//-40
        int e = 10 * -4; //40
        int f = -10 * -4; //40

        System.out.println("===============================");
        int x =100;
        ++x;//101

        System.out.println(x);

        int y = 100;
        --y;
        System.out.println(y);

        System.out.println("======================================");

        int a2 = 100;
        System.out.println(a2++);
        System.out.println(a2);

        int b2 = 100;
        System.out.println(b2--);
        System.out.println(b2);


















    }
}
