package day33_ArrayList;

import java.util.ArrayList;

public class WarmUpTask {
    public static void main(String[] args) {
       /* 1. write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1,2,3,4,5];
        output: [1,2,3,4,0];*/

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("list = " + list);

        list.set(4,0);
        System.out.println("list = " + list);


        System.out.println("---------------------------");

      /*
        2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]

       */


        ArrayList<Integer> oddNumber=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int each: oddNumber){
            if(each%2!=0){
                each*=2;
            }
            System.out.println(each);
        }








    }
}
