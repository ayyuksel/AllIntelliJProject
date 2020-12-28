package day12_NestedIf;

public class EqualityOfNumber {
    public static void main(String[] args) {
        int n1 =100;
        int n2 =200;
        int n3 =300;
        String result="";
        if(n1 ==n2 && n2 ==n3){
            result = "All equal";
        }else if(n1==n2){
            result="n1&n2 are equal";

        }else if(n2==n3){
            result="n2&n3 are equal";
        }else if(n1==n3){
            result="n1&n3 are equal";
        }else {
            result = "none are equal";

            System.out.println("result = " + result);

        }

        String result2 =(n1 ==n2 && n2 ==n3)?"All equal":(n1==n2)?"n1&n2 are equal":(n2==n3)?"n2&n3 are equal":(n1==n3)?"n1&n3 are equal":"none are equal";
        System.out.println("result2 = " + result2);




    }
}
