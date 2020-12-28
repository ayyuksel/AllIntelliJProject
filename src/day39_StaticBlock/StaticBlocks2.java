package day39_StaticBlock;

public class StaticBlocks2 {
    public static void main(String[] args) {
//Main method will be last one to run
        System.out.println("Main Method");

    }

    static{
        System.out.println("Static Block 1");
    }

    static{
        System.out.println("Static block 2");
    }

    static{
        System.out.println("Static block 3");
    }



}