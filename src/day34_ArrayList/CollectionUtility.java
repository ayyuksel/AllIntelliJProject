package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        System.out.println("Collections.sort()===========================");
        //Collections.sort(): sort array list ascending order
        ArrayList<Character> chars =new ArrayList<>();

        chars.add('X');
        chars.add('Z');
        chars.add('Y');
        chars.add('W');
        chars.add('A');

        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(70);
        scores.add(50);
        scores.add(90);
        scores.add(60);
        scores.add(80);

        Collections.sort(scores);

        System.out.println(scores);
        System.out.println("maximum number: "+scores.get(scores.size()-1));
        System.out.println("minimum number: "+scores.get(0));


        System.out.println("Collections.swap============================");
        //Collections.swap(ArrayList, index1, index2)
        //Swap element at given index
        Collections.swap(scores,3,2);
        System.out.println(scores);
        Collections.swap(scores,0,scores.size()-1);
        System.out.println(scores);
        Collections.swap(scores,scores.indexOf(60),scores.lastIndexOf(70));
        System.out.println(scores);


        System.out.println("Collections.replaceAll==========================");
        //Collections.replaceAll(ArrayList, Olf Value, New value)
        ArrayList<Character>list=new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('A');
        list.add('D');
        list.add('A');
        list.add('A');
        list.add('A');

      /*  for(int i = 0; i<=list.size()-1; i++){
            char each = list.get(i);
            if(each=='A'){
                list.set(i,'E');//index number i

            }
        }*/
        Collections.replaceAll(list,'A','E');
        System.out.println(list);

        System.out.println("Collections.frequency===================");
        //Collections.frequency(ArrayList,Element):return frequency of given element
        int frequencyOfE=Collections.frequency(list,'E');
        System.out.println(frequencyOfE);

        System.out.println("==============================");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(1000);
        nums.add(20);
        nums.add(200);
        nums.add(2000);
        nums.add(10);

        int max=Collections.max(nums);
        int min=Collections.min(nums);
        System.out.println(min);
        System.out.println(max);





    }
}
