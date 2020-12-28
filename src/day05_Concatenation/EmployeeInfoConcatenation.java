package day05_Concatenation;

public class EmployeeInfoConcatenation {
    public static void main(String[] args) {
        String firstName = "Ayse";
        String lastName ="Yuksel";
        String fullName = firstName+" "+lastName;
        char gender='F';//''for single character
        int age=35;
        String companyName="Bank of America";
        String jobTitle= "SDET";
        double salary = 160000;
        boolean isFullTime=false;
        boolean isMarried=false;



        System.out.println("Employee's full name is: "+fullName);
        System.out.println(fullName+"'s gender is: "+gender);
        System.out.println(fullName+"'s age is: "+age+" years old");
        System.out.println(fullName+" works at "+"\""+companyName +"\"");
        System.out.println(fullName+"'s job title is: "+jobTitle);
        System.out.println(fullName+"' salary is: $"+salary);







    }
}
