package day41_Encapsulation;

import day41_Encapsulation.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
//1B


    public static void main(String[] args) {


        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(

                new Item("sanitizer", 15, 30),
                new Item("mask", 10, 225),
                new Item ("Watermelon",  2,2.24),
                new Item("toilet paper", 20, 50),
                new Item("sanitizer", 15, 30),
                new Item("mask", 10, 225)

        ));

        System.out.println(items);

        double total =0;
        for(Item each:items){
            total +=  each.calcCost();
        }

        System.out.println("total = " + total);









    }
}
