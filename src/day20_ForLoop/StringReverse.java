package day20_ForLoop;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Ayse Yuksel";

        String result = "";

        for(int i = str.length()-1; i>=0; i--){

            result+=str.charAt(i);
        }
        System.out.print("result = " + result);




    }
}
