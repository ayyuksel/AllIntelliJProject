package Unit3Assessment;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("h:mm a");
        //time.plus(2);
        System.out.println(time.format(format));


    //Q26
    ArrayList<String>str=new ArrayList<>();
    str.add("j");
    str.add(0,"1");
    str.add("i");
    str.add(2,"5");
    str.remove(1);
    str.add("e");
    str.add("i");
    str.remove("i");
        System.out.println(str);




        //27
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
        String s="";

        for(int i=0; i<numbers.size(); i++){
            if(i==2||i==5||i==9){
                continue;
            }
            if(numbers.get(i)==2||numbers.get(i)%3==0){
                s+="1";
            }else {
                s+="0";
            }
        }
        System.out.println("s = " + s);

}
}