package day18_String_Continue;

public class StringMethod3 {
    public static void main(String[] args) {
        String sentence = "Java is fun, Java is cool";

        sentence=sentence.replace("Java","Python");
        System.out.println("sentence = " + sentence);

        String email ="CybertekSchool@gmail.com";
        email=email.replace("gmail","yahoo");
        System.out.println("email = " + email);


        String essay = "Batch 20 is cool, Batch 20 is the best, Batch 20 students are awesome";
       essay= essay.replace(" 20"," 21");
        System.out.println("essay = " + essay);

        String s = "I like to learn C#, C# is very cool";
        s=s.replace("C#","Java");
        System.out.println("s = " + s);

        System.out.println("=================================");
        String r = "Cat is friendly, Cat is cute";
        r=r.replaceFirst("Cat","Dog");
        System.out.println("r = " + r);


        String t ="I like to learn Java, because Java is cool, Java is powerful";

        t=t.replaceFirst("e Java","e Python").replaceFirst(", Java",", C#");

        System.out.println("t = " + t);


        String a ="Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";
        a=a.replaceFirst("as Monday","as Sunday").replaceFirst("e Monday","e Tuesday");
        System.out.println("a = " + a);

        System.out.println("===========================================");
        String emailAddress ="Cybertek_School@gmail.com";
        int beginningIndex = emailAddress.indexOf("@")+1;
        int endingIndex=emailAddress.indexOf(".");//same as a substring method does not include ending index
        String domain = emailAddress.substring(beginningIndex,endingIndex);
        System.out.println(domain);

        System.out.println("==============================================");

        String p = "I like to watch movies and reading books";
        String word2 = p.substring(p.indexOf("m"),p.indexOf(" a"));
        System.out.println(word2);
        System.out.println("==============================");
        String y = "I like to learn Java, Java is cool, I like to watch Jumanji";
        int n1 = y.indexOf(", J")+2;
        System.out.println("n1 = " + n1);

        int n2 = y.lastIndexOf("J");
        System.out.println("n2 = " + n2);

        String name = "My name is Ayse";
        String result = name.substring(name.lastIndexOf("A"));
        System.out.println("result = " + result);












    }
}
