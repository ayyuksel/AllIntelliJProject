package day08_ShortHand_Relatinal;

public class Unary_Practice {
    public static void main(String[] args) {
        int a=100;
        int b =-a++ + ++a - a-- * a--%2;

        System.out.println("b = " + b);
    }
}
