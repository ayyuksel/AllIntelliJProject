package day29_Methods;

public class cMethodsWithoutParameter2 {
    public static void main(String[] args) {
printsOddNumber1to100();
printsEvenNumber1To100();

    }

    public static void printsOddNumber1to100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void printsEvenNumber1To100(){
        for(int i = 0; i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

}
