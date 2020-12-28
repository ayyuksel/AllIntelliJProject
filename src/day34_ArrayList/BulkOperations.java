package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
    //containsAll();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        //verify if 10 is contained in the list
        boolean r1 =list.contains(10);
        System.out.println("r1 = " + r1);
        //Arrays.asList(ArrayValue):returns as collection type. Only work for none primitive arrays
        boolean r2 = list.contains(10) && list.contains(20)&& list.contains(30);
        boolean r3=list.containsAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println("r3 = " + r3);

        System.out.println("=====================");
        ArrayList<String > group1 = new ArrayList<>();
        group1.add("Mohammad");
        group1.add("Svetlana");
        group1.add("Ahmed");
        group1.add("Ercan");
        boolean b1 = group1.containsAll(Arrays.asList("Ahmet","Ercan","Biden"));
        System.out.println(b1);

        boolean b2 = group1.containsAll(Arrays.asList("Mohammad", "Ahmed","Svetlana"));
        System.out.println(b2);


        System.out.println("==========================================");
        //addAll();add multiple element to array
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b','c','d','e'));

        System.out.println(chars);

        String[] names = {"Mustafa", "Numan", "Abdullah","Inna", "Emre", "Sinan","Ramiz","Olesea","Irina","Irina","Irina","Inna","Inna","Inna"};
        ArrayList<String> students = new ArrayList<>( Arrays.asList(names));
        //students.addAll(Arrays.asList(names));
        System.out.println(students);


        ArrayList<Character> ch1 = new ArrayList<>(Arrays.asList('A','B','C','D','E'));
        ch1.addAll(Arrays.asList('J','K','L','M'));
        System.out.println(ch1);

        System.out.println("========================================");
        ArrayList<String > group2 = new ArrayList<>();
        group2.addAll(Arrays.asList(names));
        System.out.println("group2 = " + group2);
        group2.removeAll(Arrays.asList("Inna","Emre","Irina","Sinan"));
        System.out.println(group2);

        System.out.println("=========================");
        //removeAll();
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll( Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz"));

        employees.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employees);



        System.out.println("======================================");
        //retainAll()
        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll( Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz"));
        employees2.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employees2);







    }
}
