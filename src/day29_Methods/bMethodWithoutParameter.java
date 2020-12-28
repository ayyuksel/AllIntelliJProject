package day29_Methods;

public class bMethodWithoutParameter {//independent method
    public static void main(String[] args) {
    printHello5Times();
        System.out.println("ayse");
        printHello5Times();
        System.out.println("cybertek");
        printHello5Times();
        bMethodWithoutParameter.printHello5Times();
        cMethodsWithoutParameter2.printsEvenNumber1To100();
        cMethodsWithoutParameter2.printsOddNumber1to100();
    }

    public static void printHello5Times() {//independent method
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello");
        }

    }
}