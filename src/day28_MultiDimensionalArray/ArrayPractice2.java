package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String[] employeeNames = {"Asel", "Afrooz", "Safa", "Suveyda", "Rinat"};
        int[] employeeSalary = {100000, 110000, 105000, 120000, 115000};

        int max = employeeSalary[0];
        String nameOfMax = "";

        int min =employeeSalary[0];
        String nameOfMin="";



        for (int i = 0; i <= employeeNames.length - 1; i++) {
            System.out.println(employeeNames[i] + " $" + employeeSalary[i]);

            if (employeeSalary[i] > max) {
                max=employeeSalary[i];
                nameOfMax=employeeNames[i];
            }
            if(employeeSalary[i]<min){
                min=employeeSalary[i];
            }


        }
        System.out.println("nameOfMax = " + nameOfMax);
        System.out.println("nameOfMin = " + nameOfMin);
    }
}