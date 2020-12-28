package day27_ForEachLoop;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String [] names = {"Delaram","Aysel","Snoop","Erjon"};
        for(String each:names){
            System.out.println(each);
        }

    int [] numbers ={1,2,3,4,5,6,7,8,9,10,11,12};
        int countEven =0;
        int countOdd =0;

        for(int each : numbers){//each is element of the arrays
            if(each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);
        System.out.println("-----------------------------------");

        int[] scores = {10,2,3,25,100,-5,-2,1000,30,40,56};
        int max=scores[0];
        int min=scores[0];
        for(int each :scores){
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }


        System.out.println("min = " + min);
        System.out.println("max = " + max);



















    }
}
