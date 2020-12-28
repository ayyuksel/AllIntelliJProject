package day41_Encapsulation;

import day41_Encapsulation.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {


        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(

                new Item("sanitizer",15,30),
                new Item("mask",30,30)

        ));

        System.out.println(items);

        double total =0;
        for(Item each:items){
            total +=  each.calcCost();
        }

        System.out.println("total = " + total);









    }
}
