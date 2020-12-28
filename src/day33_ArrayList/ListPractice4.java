package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice4 {
    public static void main(String[] args) {
        System.out.println("indexOf()===========================");
        //indexOf(): returns first matching objects index number
        //lastIndexOf: return last matching objects index number
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(40);
        list.add(10);
        list.add(50);

        int n1=list.indexOf(10);
        System.out.println(n1);
        int n2 =list.lastIndexOf(10);
        System.out.println(n2);


        System.out.println("containd()============================");
        //contains (object); its going to verify if the object in the list
        System.out.println(list.contains(60));
        System.out.println( list.contains(40));

        ArrayList<Character> character = new ArrayList<>();
        character.add('A');
        character.add('A');
        character.add('B');
        character.add('C');
        character.add('C');

        System.out.println(character);

        ArrayList<Character> nonDup = new ArrayList<>();
        for(char each: character){
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        /*
        for(char each: character){
        if(!nonDup.contains){
        nonDup.add(each)
         */
        /*
        for(int i = 0; i <= character,size(i)-1; i++){
        if(!numDup.contains(character.get(i))){
        nunDup.add(character.get(i));
        }}
         */

        System.out.println("nonDup = " + nonDup);

        System.out.println("equal(): =======================");
        //equal(list):compares if the given list is equal to the list, return boolean

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(2);
        list2.add(1);
        System.out.println(list1.equals(list2));


        System.out.println("isEmpty======================");
        list1.clear();
        list2.clear();
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());



    }
}
