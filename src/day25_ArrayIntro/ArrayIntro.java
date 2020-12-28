package day25_ArrayIntro;

public class ArrayIntro {
    /*
Data Structures: to use data efficiently, organize the data
1. Array
2. Collection
3. Map

variable :
            dataType name = data;
            int number = 100;


Array variable : a variable that can have multiple data
            *****Array size is fixed
declare array :
            dataType[] = {data1, data3, data3}


            initializing the size;
            dataType[] arrayName = new dataType[length];
            String [] students = new  String[10];

 */


    public static void main(String[] args) {


        String[] names = {"Azad", "Ayse", "Inna", "Erjon", "Aysel"};
          //index number     0       1       2      3           4
                //retrieve data from array

        System.out.println( names[0]);
        String str = names[1];
        System.out.println(str);


        int [] scores = {80,85,90,70,75};
        System.out.println(names[3]+": "+scores[3]);
        System.out.println(names[1]+": "+scores[1]);

        System.out.println("---------------------------------------");
//in array do not give (), because length is not method in array
        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]+": "+scores[i]);
        }







    }
}