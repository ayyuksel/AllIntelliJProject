package day25_ArrayIntro;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "abcababe";
        String result = "";

        for (int j = 0; j < str.length(); j++){

            char ch = str.charAt(j);//how can i get first character and assign to string
        int count = 0;//frequency of char

        for (int i = 0; i < str.length(); i++) {// i represent index of str
            char eachChar = str.charAt(i);//eac character of String
            if (eachChar == ch) {
                count++;
            }
        }//count the frequency of char then assign to count

        if (count == 1) {//if frequency one means unique
            result += ch;
        }
    }

        System.out.println(result);

    }
}
