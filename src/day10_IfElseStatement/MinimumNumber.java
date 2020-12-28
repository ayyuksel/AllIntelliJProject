package day10_IfElseStatement;

public class MinimumNumber {
    public static void main(String[] args) {
        int n1 =100;
        int n2 =200;
        int n3 =300;

        boolean n3IsMin = n3<n1&&n3<n2;
        boolean n2IMin = n2<n1 && n2<n3;
        boolean n1IsMin = !n3IsMin && !n2IMin;

        String str = " is minimum number";
         int min = 0;

        if(n1IsMin){
            //System.out.println(n1+str);
            min =n1;
        }
        if(n2IMin){
            //System.out.println(n2+str);
            min=n2;
        }
        if(n3IsMin){
            //System.out.println(n3+str);
            min=n3;
        }
        System.out.println(min+str);


    }
}
