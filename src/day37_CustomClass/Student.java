package day37_CustomClass;

import day02_FirstJavaProgramming.GasReceipt;

import java.time.LocalDate;

public class Student {
    public String name, ID;
    public LocalDate DOfB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo(String name, char gender, LocalDate DOfB, String ID, double gpa){
        this.name  = name;
        this.gender =gender;
        this.DOfB = DOfB;
        age = LocalDate.now().getYear() - DOfB.getYear();
        this.ID = ID;
        this.gpa = gpa;
    }

    /*public void getInfo(){//we don't have to call get info we can use to String Method
        System.out.println("Student name : " + name + "\nStudent ID   : " + ID + "\ngpa: " + gpa + "\nAge: " + age + "\nGender: " + gender);
    }
*/

//when  you pass  the obj automatically will printed. You don't need the cal the method
    public String toString() {
        return
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", DOfB=" + DOfB +
                ", age=" + age +
                ", gender=" + gender +
                ", gpa=" + gpa ;

    }


}