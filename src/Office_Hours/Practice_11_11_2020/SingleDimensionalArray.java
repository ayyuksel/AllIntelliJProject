package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
    //length-1
        int [] scores =new int[5];
                    //length-1
                    //last index =1-1=0



       //    index num
        scores[0]=10;
        scores[1]=20;
        scores[2]=30;
        scores[3]=40;
        scores[4]=50;
        System.out.println(Arrays.toString(scores));
//print 50
        System.out.println(scores[4]);
                       //i<5
        for (int i = 0; i<scores.length; i++){
            System.out.println(scores[i]);
        }

        System.out.println("==========================");



        for (int each: scores){//each element
            System.out.println(each);
        }






    }
}
