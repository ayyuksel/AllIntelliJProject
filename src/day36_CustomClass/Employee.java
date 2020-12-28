package day36_CustomClass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

//this: refers to object instance. Only used when local variable sharing as instance
    //instance variable:to be able to store different data to different object
    //employees object
    //instance method
//instance variable
    public String name,jobTitle,ID,companyName;
    public double salary;
    private LocalDate hireDate;
    public char gender;

    //local variable        argument
    public void setInfo(String name, char gender, String jobTitle,String companyName, double salary,String ID, LocalDate hireDate){
    this.name=name;//local variable is preferred one that why this key word is used
    this.gender=gender;//local=instance
    this.jobTitle=jobTitle;
    this.companyName=companyName;
    this.salary=salary;
    this.ID=ID;
    this.hireDate=hireDate;
    }
    public void getInfo(){
        DateTimeFormatter df =DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DecimalFormat decimal= new DecimalFormat("0.00");
        System.out.println("Name: "+name+", Gender: "+gender+", ID"+ID+", Company name:"+companyName
        +", Job Title: "+jobTitle+"Salary: $"+decimal.format(salary)+", hire Date: "+hireDate.format(df));
    }

    public void working(){
        System.out.println(name+" is working");
    }
    public void meeting(){
        System.out.println(name+"is in a meeting");
    }






}
