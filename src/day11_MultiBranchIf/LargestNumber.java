package day11_MultiBranchIf;

public class LargestNumber {
    public static void main(String[] args) {
        int n1 =100;
        int n2 =200;
        int n3 = 300;

        boolean n1IsMax =n1>n2 && n1>n3;
        boolean n2IsMax =n2>n1 && n2>n3;

        if(n1IsMax){
            System.out.println("first number is max "+n1);
        }else if(n2IsMax){
            System.out.println("second number is max "+n2);
        }else {
            System.out.println("third number is max "+n3);
        }




    }
}
