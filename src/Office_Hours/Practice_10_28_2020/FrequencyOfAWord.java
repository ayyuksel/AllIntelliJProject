package Office_Hours.Practice_10_28_2020;

public class FrequencyOfAWord {
    public static void main(String[] args) {

    String str = "Cat Cat Cat";

    String word ="Cat";

    int count =0;

    while (str.contains(word)){
        str=str.replaceFirst(word,"");
        count++;
    }

        System.out.println(count);














    }
}
