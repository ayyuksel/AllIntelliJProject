package day08_ShortHand_Relatinal;

public class ShortHandOperators {
    public static void main(String[] args) {
        //= assignment operator
        int a =10;
            a =30;
        System.out.println(a);

        String schoolName = "Cybertek";
        schoolName = "MIT";
        System.out.println("schoolName = " + schoolName);

        //-=; Subtraction Assignment
        int x =100;
        x-=62;
        System.out.println("x = " + x);

        int salary = 100000;//0.28;
        salary-=(salary*0.28);
        System.out.println(salary);
        int x2 = 999999;
        x2-=25;
        System.out.println("x2 = " + x2);

        double balance = 2000;
        balance-=450;
        System.out.println("balance = " + balance);

        //Addition Assignment +=;
        balance +=5000;
        System.out.println(balance);

        int y2 =400;
        y2 +=10000 * 0.1;
        System.out.println("y2 = " + y2);

        String name = "Cybertek";
        name+=" School";
        System.out.println("name = " + name);

        //Multiplication Assignment *=;
        double totalTax =100000;
        totalTax*=0.28;
        System.out.println("totalTax = " + totalTax);

        int bonus =5000;
        bonus*=2;
        System.out.println("bonus = " + bonus);

        //Division Assignment /=;
        int y3 =10;
        y3/=5;
        System.out.println("y3 = " + y3);

        int house =500000;
        int month =240;
        double monthly =500000;
        monthly/=240;
        System.out.println("monthly = " + monthly);

        //Remainder Assignment %=;

        int a2 = 100;
        a2%=3;
        System.out.println("a2 = " + a2);




    }
}
