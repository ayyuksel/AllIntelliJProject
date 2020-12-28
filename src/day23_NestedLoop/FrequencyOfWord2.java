package day23_NestedLoop;

import java.util.Locale;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentence = "Java Java java java";
        String word ="Java";
        word=word.toLowerCase();

        String temp = sentence.toLowerCase();
        int count = 0;

        while(temp.contains(word)){
            temp=temp.replaceFirst(word,"");
            count++;
        }

        System.out.println("count = " + count);

    }
}
