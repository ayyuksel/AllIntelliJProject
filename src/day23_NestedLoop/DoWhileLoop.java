package day23_NestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean condition = false;
        while (condition){
            System.out.println("Helo Batch 21");
        }

        do{//get executed once eve condition is false
            System.out.println("Hello batch 21");
        }while (condition);
    }
}
