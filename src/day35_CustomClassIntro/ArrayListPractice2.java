package day35_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        String [] jobTitles = {"SDET", "Scrum Master", "QA","Developer","PO","BA","CEO","SDET","QA","Developer","SDET"};
        //convert String array to collection
        ArrayList<String> jobs = new ArrayList<>();
        jobs.addAll(Arrays.asList(jobTitles));
        //jobs.retainAll(Arrays.asList("SDET","QA"));***by default still Array


        jobs.removeIf(p->!p.equals("SDET") && !p.equals("QA"));
        System.out.println("jobs = " + jobs);

        System.out.println("======================================");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,-1,-2,-3,-4));
       // numbers.retainAll(Arrays.asList(7,8,9));

        //numbers.removeIf(p->!(p==7 || p==8||p==9));
        numbers.removeIf(p->p<7);



        System.out.println("numbers = " + numbers);

        System.out.println("====================================");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,100,200,300,400,500));

        //list.removeIf(p->p>100);

        //do not use lambda
        ArrayList<Integer> temp = new ArrayList<>();
        for(int each : list){
            if(each<=100){
                temp.add(each);
            }
        }
        list=temp;
        System.out.println("list = " + list);





























    }
}
