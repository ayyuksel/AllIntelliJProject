package day33_ArrayList;


import day08_ShortHand_Relatinal.GallonsToLiters;

import java.util.ArrayList;
import java.util.Arrays;

public class recap {
    public static void main(String[] args) {
       ArrayList<Integer> odd =new ArrayList<>();

ArrayList<Integer> even =new ArrayList<>();

for(int i =0; i<=100; i++){
    if(i%2==0){
        continue;


    }
    even.add(i);
}
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);













    }
}
