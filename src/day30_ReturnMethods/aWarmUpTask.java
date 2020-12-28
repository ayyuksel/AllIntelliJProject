package day30_ReturnMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class aWarmUpTask {
    public static void main(String[] args) {
        positiveNegativeZero(123);
        positiveNegativeZero(0);
        positiveNegativeZero(-9);
        System.out.println("---------------------------------------------");
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0};
        //we only need element of array we don't need to access index number
        for (int each : number) {
            positiveNegativeZero(each);
        }
           /* for(int i =0; i<number.length;i++){
                positiveNegativeZero(number[i]);
            }*/
        gradeCalculator(70);
        gradeCalculator(-100);
        int[] a1 = {10, 50, 60, 70};
        int[] a2 = {20, 90, 100};
        combineTwoArrays(a1, a2);

      removeDuplicates("aaafffkkkkallsdjldjsldjsdlsdjjldsdjdknd");
    formattedFullName("ayse","yuksel");
    }

    //task 1:
    public static void positiveNegativeZero(int number) {
        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println(number + " is: " + result);
    }

    //task 2:
    public static void gradeCalculator(int score) {
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println('A');
            } else if (score >= 80) {
                System.out.println('B');
            } else if (score >= 70) {
                System.out.println('C');
            } else if (score >= 60) {
                System.out.println('D');
            } else {
                System.out.println('F');
            }


            //System.out.println( (score>=90)?'A':( score>=80)?'B':( score>=70)?'D':'F');

        } else {
            System.out.println("Invalid score");
        }

    }

    //task 3: combination of 2 integer array

    public static void combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];//in
        int i = 0; //each element  of arr1 if being assigned to the index number of third array

        for (int each : arr1) {
            arr3[i++] = each;//each elements of arr1 asig
        }
        for (int each : arr2) {
            arr3[i++] = each;
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    //task 4:
    //create function can print a string without duplicated characters
    public static void removeDuplicates(String str) {
        String result = "";
        /*for (String each : str.split("")) {//[a,a,b,c,c,b]
            if (!result.contains(each)) {
                result += each;
            }
        }
        */
        for(int i = 0; i<str.length(); i++)//[a,a,b,c,c,b]
            if (!result.contains(""+str.charAt(i))) {
                result += str.charAt(i);
            }
        System.out.println(result);
        }

     //task 5:
    public static void formattedFullName(String first, String last){
        first=first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        System.out.println(first+" "+last);
    }




    }
















