package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {
    public static void main(String[] args) {
        //dataType: Can not be primitive!
        // Arraylist does not support primitives, only support non-primitives
        //by using new keyword you will be create an object
        //you do not have worry about size


        System.out.println("add()================================");
        //add(object)= add element available next index
        //add(index, object);add element to giving index
        ArrayList<Integer>scores= new ArrayList<>();
        scores.add(100);//autoboxing==>0
        scores.add(200); //autoboxing==>1
        scores.add(300);//autoboxing==> 2
        scores.add(2,400);
        System.out.println(scores);


        System.out.println("=============================");
        ArrayList<String >groceryList=new ArrayList<>();//[Egg, Water, Milk,Bread]
        groceryList.add("Egg");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add(0,"toiler paper");
        groceryList.add(1,"Sanitizer");
        groceryList.add(1,"mask");

        System.out.println("groceryList = " + groceryList);
        String item1=groceryList.get(2);
        System.out.println("get()=================================");
        //get(): gets the element at giving index
        System.out.println("item1 = " + item1);
        String item2=groceryList.get(1);
        System.out.println("item2 = " + item2);
        //System.out.println(groceryList.get(300));
        //IndexOutOfBoundsException
        System.out.println("size()=======================================");
        int total = groceryList.size();
        System.out.println("total = " + total);
        System.out.println(groceryList.get(groceryList.size()-1));











    }
}
