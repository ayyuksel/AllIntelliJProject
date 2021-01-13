package Office_Hours.Practice_10_28_2020;

public class FrequencyOfACharacter2 {
    public static void main(String[] args) {

        String str = "ababab";

        char ch ='a';

        int count = 0;

       /* for (int i = 0; i<str.length(); i++){
            char eachChar=str.charAt(i);
            if(eachChar==ch){
                count++;

            }

        }

        System.out.println(count+""+ch);*/



        while (str.contains(""+ch)){//contains and replace first String method cannot use char
            str=str.replaceFirst(""+ch,"");
            count++;
        }


        System.out.println(count);









    }
}
