package Office_Hours.Practice_01_27_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.addAll(Arrays.asList(20,30,30,40,50,60));
        System.out.println(list.size());
       // list.remove(3);

        list.remove(Integer.valueOf(40));
        System.out.println(list.size());

        list.set(2, 300);
        System.out.println(list);
        boolean b =list.contains(300);
        System.out.println(b);
        Collections.swap(list, 0,2);
        System.out.println(list);
        int count = Collections.frequency(list, 50);
        System.out.println("count = " + count);
        list.forEach(p->{
            System.out.println(p);
        });
    }
}
