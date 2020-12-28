package JavaProgramming2020_B21.src.day22_JavaRecap;

public class StringPractice3 {
    public static void main(String[] args) {
        String sentence = "Capital of Canada is Washington";

        sentence = sentence.replace("Canada", "United State");
        System.out.println("sentence = " + sentence);


        String s = "Cybertek School is in Boston, Cybertek campus is in Mclean";
        s = s.replaceFirst("Cybertek", "MIT");
        System.out.println("s = " + s);

        String r = "cava is cool programming language, I like learn cava at cybertek school";

        r = r.replace("ca", "ja");
        System.out.println("r = " + r);

        String p = "I like Java and Java Java Java Java Java Java";
        //p=p.replace("Java","").replace("like","like Java");
        p = p.replaceFirst("Java", "C#");
        p = p.replaceFirst("Java", "java");
        p = p.replace("Java", "");
        System.out.println("p = " + p);
        //trim ; removes white space

        String str = "                  ";
        System.out.println(str.length());
        str = str.trim();
        System.out.println(str.length());


        String str2 = "         Cybertek        school";
        str2 = str2.trim();
        System.out.println("str2 = " + str2);

        System.out.println(" ==============================");
        String s2 = "I like learn Java";
        System.out.println("Contains c#: " + s2.toLowerCase().contains("java"));
        System.out.println(s2.equals("java"));
        System.out.println(s2.equalsIgnoreCase("java"));


        System.out.println("======================");
        String s3 = "Cybertek school is the best";
        System.out.println(s3.contains("cybertek"));
        System.out.println(s3.toLowerCase().contains("cybertek"));

        System.out.println(s3.equals("cybertek"));
        System.out.println(s3.equalsIgnoreCase("cybertek"));

        System.out.println("==============================");
        System.out.println("Java".isEmpty());
        System.out.println("".isEmpty());

        System.out.println("=======================================");

        //startWith, endsWith

        String URL = "https://www.amazon.com";

        boolean isValid = URL.startsWith("https") && (URL.endsWith(".com")) || (URL.endsWith(".gov")) || (URL.endsWith(".edu"));

        if (isValid) {
            System.out.println("URL is valid");
        } else {
            System.out.println("invalid");
        }

        String email = "Java Masters@java.com";

        boolean validEmail = email.endsWith("gmail.com")||email.endsWith("yohoo.com")||email.endsWith("hotmail.com")||email.endsWith("outlook.com");

        System.out.println("validEmail = " + validEmail);


















    }
}
