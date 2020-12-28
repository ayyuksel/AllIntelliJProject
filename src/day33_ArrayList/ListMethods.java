package day33_ArrayList;

import java.util.ArrayList;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println("set(): ==========================");
        //replace old element with new one
        //set(old element, new element

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(300);
        list1.add(400);

        list1.set(1,200);
        System.out.println("list1 = " + list1);


        ArrayList<String> names = new ArrayList<>();
        names.add("Yalcin");
        names.add("Amina");
        names.add("Ercan");
        names.add("Ercan");
        names.add("Tayfun");
        names.add("Mustafa");
        names.add("Tayfun");
        names.add("Suveyda");
        names.add("Egemen");

        names.set(3,"Afrooz");
        names.set(6,"Fiona");
        System.out.println(names);

        System.out.println("remove()============================");
        //remove(index)except int, does not return (void)
        //remove(object): remove first matching object, returns boolean
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        list.remove(2);
        list.remove(2);
        System.out.println("list = " + list);
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        //Character ch ='C';
       boolean r1 = list2.remove(Character.valueOf('C'));
        System.out.println(list2);
        System.out.println("r1 = " + r1);





    }
}
