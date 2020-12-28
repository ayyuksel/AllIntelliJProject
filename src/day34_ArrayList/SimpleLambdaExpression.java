package day34_ArrayList;

import com.sun.prism.PixelFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class SimpleLambdaExpression {
    public static void main(String[] args) {

        //Remove if(Predicate) =if you going to remove base on condition
       // Predicate<DataType> name p ->boolean Expression
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6) );
        Predicate<Integer> lessThan5 = each->each<5;
        numbers.removeIf(lessThan5);
        System.out.println(numbers);

        System.out.println("======================================");
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6) );

        numbers2.removeIf(element->element<7);
        System.out.println(numbers2);

        System.out.println("=====================================");

        ArrayList<Integer>scores=new ArrayList<>();
        scores.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18, 19, 20) );
        scores.removeIf(p->p%3==0);
        scores.removeIf(p->p%5==0);
        System.out.println("scores = " + scores);

        System.out.println("=================================");
        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(  Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz") );
            employees2.removeIf(p->p.startsWith("A")&&!p.equals("Ahmed"));
        System.out.println("employees2 = " + employees2);


        System.out.println("=================================================");

        ArrayList<String> employees3 = new ArrayList<>();
        employees3.addAll(  Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz") );

        employees3.removeIf( p ->  p.toLowerCase().contains("a") &&  p.toLowerCase().contains("r") );

        System.out.println(employees3);

    }
}
