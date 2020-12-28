package day23_NestedLoop;

public class CatDog {
    public static void main(String[] args) {
        String sentence = "dog do dog Dog Dog cat Cat cat cat CAt";

        String temp = sentence.toLowerCase();

        int countDog=0;


        while (temp.contains("dog")){
            temp=temp.replaceFirst("dog", "");
            countDog++;
        }
        System.out.println("countDog = " + countDog);

        int countCat=0;
        while (temp.contains("cat")){
            temp=temp.replaceFirst("cat","");
            countCat++;
        }

        System.out.println("countCat = " + countCat);

        System.out.println(countCat==countDog);






    }





}
