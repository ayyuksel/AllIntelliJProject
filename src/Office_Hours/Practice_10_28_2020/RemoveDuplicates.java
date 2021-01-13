package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "ayseyuksel";

        String nonDup = "";//if the character is not contain concat it
        for (int i = 0; i < str.length(); i++) {
            //str.charAt(i);
            String eachChar = "" + str.charAt(i);
            if (nonDup.contains(eachChar)) {

//if the character is  contain in string skip
                continue;
            } else {
                nonDup += eachChar;
            }
        }
        System.out.println("nonDup = " + nonDup);
    }
}
