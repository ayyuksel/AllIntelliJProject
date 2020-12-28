package day34_ArrayList;

import java.util.ArrayList;

public class WarmUpTask {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(30);
        number.add(1, 40);
        System.out.println(number);

        number.set(number.size() - 1, 0);
        System.out.println(number);
        number.clear();
        System.out.println(number.isEmpty());

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        for (int i = 0; i <= number.size() - 1; i++) {
            int each = number.get(i);//unboxing
            if (each % 2 != 0) {
                number.set(i, each * 2);
            }
        }
        System.out.println("number = " + number);
        System.out.println("==========================");


        int[] scores = {65, 75, 85, 68, 88, 82, 72, 95, 99, 98};
        ArrayList<Integer> AList = new ArrayList<>();
        ArrayList<Integer> BList = new ArrayList<>();
        ArrayList<Integer> CList = new ArrayList<>();
        ArrayList<Integer> DList = new ArrayList<>();
        ArrayList<Integer> FList = new ArrayList<>();

        for (int each : scores) {
            if (each >= 0 && each <= 100) {
                if (each >= 90) {
                    AList.add(each);
                } else if (each >= 80) {
                    BList.add(each);
                } else if (each >= 70) {
                    CList.add(each);
                } else if (each >= 60) {
                    DList.add(each);
                } else {
                    FList.add(each);
                }

            }
        }
        System.out.println("Total number of A: " + AList);
        System.out.println("Total number of B: " + BList);
        System.out.println("Total number of C: " + CList);
        System.out.println("Total number of D: " + DList);
        System.out.println("Total number of F: " + FList);

        System.out.println("A list: "+AList);
        System.out.println("Blist: "+BList);
        System.out.println("C list: "+CList);
        System.out.println("D list: "+DList);
        System.out.println("Flist: "+FList);


    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
			ex:
				list = [1,2,3,4,5];
				output: [1,2,3,4,0];
2. write a program that can multiply each odd number by 2
			ex:
			    list = [1,2,3,4,5];
				output: [2,2,6,4,10]
 */