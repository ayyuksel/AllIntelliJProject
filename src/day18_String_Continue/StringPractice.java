package day18_String_Continue;

public class StringPractice {
    public static void main(String[] args) {

        String s1 ="Cat";
        String s2 ="Cat";

        String s3 = new String("Cat");
        String s4 = new String("Cat");

        String s5 =new String("cat");

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false

        System.out.println(s2==s3);//false
        System.out.println(s3==s4);//false

        System.out.println("==================================");
        //equals();only compare text
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));

        System.out.println("=========================== ");
        System.out.println(s4.equals(s5));//false
        System.out.println(s4.equalsIgnoreCase(s5));

        System.out.println("===========================");
        String str="cybertek";
        str=str.toUpperCase();
        System.out.println(str);
        str=str.toLowerCase();
        System.out.println(str);
        System.out.println("================================");
        String name = "Ayse Yulsel";
        //System.out.println(name.length());
        int n1 =name.length();
        System.out.println(n1);

        String name2 = "Muhtar";
        int n2 =name2.length();
        System.out.println(n2);

        int lastIndex =name2.length()-1;
        System.out.println(lastIndex);

        System.out.println("=====================================");

        String a = "Cybertek School";
        char firstChar =a.charAt(0);
        char lastChar = a.charAt(a.length()-1);//Last Character: l

        System.out.println("first character: "+firstChar);
        System.out.println("Last Character: "+lastChar);

        System.out.println("==================================");
        String b="Today is Monday";
        char secondChar = b.charAt(1);
        char secondLastChar= b.charAt(b.length()-2);
        System.out.println("secondChar = " + secondChar);
        System.out.println("secondLastChar = " + secondLastChar);

    }
}
