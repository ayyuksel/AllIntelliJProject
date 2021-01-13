package Office_Hours.Practice_11_26_2020;

public class LoopPractice1 {
    public static void main(String[] args) {
        for (int i = 0; i<=50; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 2; i<= 50; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 1; i<= 49; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i =1; i<=50; i++){
            if(i%2!=0){
                continue;//skip
            }
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i =1; i<=50; i++){
            if(i%2==0){
                continue;//skip
            }
            System.out.print(i+" ");
            if(i ==29){
                break;//exits to loop
             // return;terminate all method
            }


        }
        System.out.println();
        System.out.println("hello");


    }
}
