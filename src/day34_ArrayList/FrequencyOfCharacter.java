package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBBCDDDDEEE";
        String result= "";

        ArrayList<String> list =new ArrayList<>(Arrays.asList(str.split("")));//in order to be able to use frequency method
       /* for(String each: str.split("")) list.add(each);//we every character from str and add them into array
        System.out.println(list);*/
        for(String each:list){
            int frequency = Collections.frequency(list,each);
            if(!result.contains(each))
            result+=each+frequency;
        }

        System.out.println(result);


    }
}
