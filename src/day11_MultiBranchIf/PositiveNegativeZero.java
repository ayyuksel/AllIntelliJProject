package day11_MultiBranchIf;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int number = 100;
        if(number<0){
            System.out.println("Negative");
        }else if(number>0){
            System.out.println("Positive");
        }else{
            System.out.println("Zero");
        }
    }
}
