package day18_String_Continue;

public class StringMethods4 {
    public static void main(String[] args) {
        String str = "Hello Everyone";
        System.out.println(str.isEmpty());
        String str2 = "";
        System.out.println(str2.isEmpty());


        //contains
        String sentence = "I like to learn Java";

        System.out.println(sentence.contains("C#"));
        System.out.println(sentence.contains("Java"));

        String web = "www.amazon.com";
        boolean valid = web.startsWith("www.")&&web.endsWith("com");
        System.out.println("valid = " + valid);




    }
}
