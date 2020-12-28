package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,6,7,8,8,9,9,10));
        numbers.removeIf(p-> Collections.frequency(numbers,p)>1);
        System.out.println("numbers = " + numbers);

        System.out.println("====================================");
        //non duplicated
        String str="aabaacdde";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(p->Collections.frequency(list,p)>1);
        System.out.println("list = " + list);
        String result= list.toString().replace(",","").substring(1).replace("]","");
        System.out.println("result = " + result);
        System.out.println("======================================");




        ArrayList<Character> chars =new ArrayList<>();
        chars.addAll(Arrays.asList('a', '1', 'b', '2', 'c', 'd', '$', '#', '@', '?', '*'));
        chars.removeIf(p->Character.isDigit(p));
        chars.removeIf(p->Character.isLetter(p));
        //chars.removeIf(p->Character.isLetter(p)||Character.isDigit(p));
        //chars.removeIf(p->Character.isLetterOrDigit(p));
        System.out.println(chars);

    }
}
