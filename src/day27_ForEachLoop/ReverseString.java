package day27_ForEachLoop;

public class ReverseString {
    public static void main(String[] args) {
        String[] names = {"Delaram", "Aysel", "Snoop", "Erjon"};


        for (String eachName : names) {
            String reverseName = "";
            for (int i = eachName.length() - 1; i >= 0; i--) {
                reverseName += eachName.charAt(i);
            }
            System.out.println(reverseName);
        }

    }
}