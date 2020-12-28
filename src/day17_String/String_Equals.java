package day17_String;

public class String_Equals {
    public static void main(String[] args) {
        String str ="jira";
        String str2 = new String("jira");

        System.out.println(str==str2);//this will compare the location
        System.out.println(str.equals(str2));//this will compare the values

        System.out.println(str.equals("Jira"));

        System.out.println(str.equalsIgnoreCase("Jira"));
    }
}
