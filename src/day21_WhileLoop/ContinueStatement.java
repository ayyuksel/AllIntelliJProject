package day21_WhileLoop;

public class ContinueStatement {//skip iteration
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println("=====================================");

        //print all the odd numbers
        for (int i = 1; i<= 50; i++){
            if(i%2==0){
               continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 1; i<=50; i++){
            if(i%2==1){
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 1; i<=50; i++){
            if(i%3!=0){
                continue;
            }
            System.out.print(i+" ");
        }







    }
}
