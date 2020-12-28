package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        String[][] scrumTeam={
                {"Dorin", "Adil", "Fatih", "Subhi"},  // 0
                {"Katrin", "Mustafa", "Ruslan"},      //1
                {"Ayse"},                             //2
                {"Omid"},                             //3
                {"Agalar"}                  //4

        };
        System.out.println(Arrays.deepToString(scrumTeam));
        for(int i =0; i<=scrumTeam.length-1;i++){
            System.out.println( Arrays.toString(scrumTeam[i]));
            for(int j = 0; j<=scrumTeam[i].length-1;j++){
                System.out.println(scrumTeam[i][j]);
            }
        }
        System.out.println("----------------------------");
       for(String[] eachGroup:scrumTeam) {
           System.out.println( Arrays.toString(eachGroup));


           for(String eachName:eachGroup){
               System.out.println(eachName);
           }
       }











    }
}
