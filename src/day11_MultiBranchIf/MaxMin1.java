package day11_MultiBranchIf;

public class MaxMin1 {
    public static void main(String[] args) {
        int a =100;
        int b =200;

        int max1 =0;
        if(a>b){
            max1=a;
        }else{
            max1=b;
        }
        System.out.println(max1);

        int max2 = ( a>b ) ? a : b;
        System.out.println(max2);

        int min1 = 0;
        if(a<b){
            min1=a;
        }else {
            min1=b;
        }
        System.out.println(min1);

        int min2 = (a<b)?a:b;

        System.out.println(min2);



    }
}
