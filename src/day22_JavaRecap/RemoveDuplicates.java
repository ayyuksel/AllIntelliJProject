package JavaProgramming2020_B21.src.day22_JavaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABB";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            String eachCharacter = "" + str.charAt(i);
            if (result.contains(eachCharacter)) {
                continue;
            } else {
                result += eachCharacter;
            }
        }
        System.out.println("result = " + result);

       // if(!result.contains(eachCharacter)) result+=eachCharacter;







    }
}
