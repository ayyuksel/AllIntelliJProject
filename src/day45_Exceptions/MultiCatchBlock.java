package day45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(25 / 0);
        }catch (NoSuchElementException e){
            System.out.println("no such a element exception");

        }catch (ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception ");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }


        System.out.println("===================================");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();//after text complete give you error msg
        }


        System.out.println("==========================================");
        String [] names ={"walid", "Agalar", "Ayjeren"};

        try {
            names[10] = "Muhtar";
        }catch (IllegalArgumentException e){
            System.out.println("Illegal Argument Exception");
        }catch (NoSuchElementException e) {
            System.out.println("No Such Element Exception");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bounds Exception");
        }catch (RuntimeException e){
            System.out.println("Run time exception");
        }
    }
}
