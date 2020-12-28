package day23_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        for (int j = 1; j <= 8; j++) {//outer loop responsible for repeating each line
            for (int i = 1; i <=j; i++) {//responsible for printing star
                System.out.print("**");
            }
            System.out.println();
        }







    }
}
