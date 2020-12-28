package day05_Concatenation;

public class EmployeeInfo {
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



        System.out.print("Employee' full name is: ");
        System.out.print(fullName);
        System.out.print("' gender is: ");
        System.out.print(gender);
        System.out.println();
        System.out.print(fullName);
        System.out.print("' age is: ");
        System.out.print(age);
        System.out.println(" Years old");

        System.out.print(fullName);
        System.out.print("' works at: ");
        System.out.println(companyName);

        System.out.print(fullName);
        System.out.print("' Job title is");
        System.out.println(jobTitle);

        System.out.print(fullName);
        System.out.print("' salary is: ");
        System.out.println(salary);

        System.out.print(fullName);
        System.out.print("is full time ");
        System.out.println(isFullTime);

        System.out.print(fullName);
        System.out.print(" is married: ");
        System.out.println(isMarried);







    }
}
