package day30_ReturnMethods;

public class bReturnMethodIntro {
    public static void main(String[] args) {
        addition(5, 9);
        System.out.println(addition2(10, 20));
        int sum = addition2(10, 20);
        int multiplication = sum * 3;


    }

    public static void addition(int n1, int n2) {
        int n3 = n1 + n2;
        System.out.println(n3);
    }

    public static int addition2(int n1, int n2) {
        int n3 = n1 + n2;
        return n3;
    }
}
