package day09_IfStatement;

public class SingleIfStatement {
    public static void main(String[] args) {
        int age =20;
        boolean eligible = age>=20;
        if(eligible){
            System.out.println("you are eligible to buy alcohol");
        }
        if(!eligible){
            System.out.println("go buy your milk");
        }

        boolean isBreaktime =false;
        if(isBreaktime){
            System.out.println("time to take break");
        }
        if(!isBreaktime){
            System.out.println("continue to class");
        }
    }
}
