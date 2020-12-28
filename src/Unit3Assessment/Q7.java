package Unit3Assessment;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        method1();
        method2("The sum quickly and created shadow");
        System.out.println(method3(50));
        System.out.println(method5("apple"));
        System.out.println(method6("mark"));
        String str = method7("on the weekend", 20);
        System.out.println(str);

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] a = new int[size];
        int i = 0;
        while (i < size) {
            a[i++] = scan.nextInt();
            method8(a);
        }
       String str2 =method9(scan.next(), scan.next(), scan.next());
        System.out.println(str2);




    }

    public static void method1() {
        int n = -5;
        for (int i = 1; i < 0; i++) {
            n *= i;
        }
        System.out.println(n);
    }

    //===================================================
    //Q8
    public static void method2(String s) {

        String a = s.substring(10);
        if (a.length() > s.length()) {
            System.out.println(a);
        } else {
            System.out.println(s);
        }
    }
    //========================================================
    //Q9

    public static String method3(int num) {
        if (num < 0) {
            return "Less than 0";
        } else if (num < 50) {
            return "Less than 50";
        } else if (num < 100) {
            return "Less than 100";
        } else {
            return "other";
        }

    }
    //===========================================================
    //Q11

    public static boolean method5(String str) {
        boolean check = true;

        if (str.isEmpty()) {
            check = false;
        }
        if (!str.contains("a")) {
            check = false;
        } else if (str.contains("z")) {
            check = false;
        }
        check = str.substring(0, 1).equals("a") ? check : false;
        return check;

    }

    //============================================================
    // Q12
    public static int[] method6(String str) {
        int[] arr = new int[str.length()];
        int n = 10;
        for (int i = 0; i < arr.length; i++) {
            if (n == 20 || n == 50 || n == 70) {
                continue;
            }
            arr[i] = n;
            n *= 10;
        }
        return arr;
    }

    //==========================================================
    //Q13
    public static String method7(String str, int s) {
        str = str.substring(6);
        if (s < 10) {
            str = str.substring(8);
        } else {
            if (str.length() > s) {
                str = "weekday";
            } else if (s > 10 || s == -10) {
                str = str.substring(5);
            }
        }
        return str;
    }

    //====================================================================
    //14
    public static void method8(int[] arr) {
        for (int n : arr) {
            if (n % 4 == 0) {
                continue;
            }
            System.out.println(n);
        }


    }

    //========================================================================
    //15
    public static String method9(String one, String two, String three) {
        return "" + middle(one) + middle(two) + middle(three);
    }

    public static char middle(String s) {
        return s.charAt(s.length()/2);

    }
}