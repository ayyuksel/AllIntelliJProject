package day43_Inheritance;


class Data {
    public Data() {

    }

    public static int publicVariable = 100;
    static int defaultVariable;
    private static int privateVariable = 300;


}

//setinfo
public class Test extends AccessModifier {
    public static void main(String[] args) {
        //System.out.println(Test.defaultVariable);
        //System.out.println(Test.publicVariable);
        // System.out.println(Test.priavetVarible);

        //public Data(){}
        //constructor cannot be inherited because of the naming rules
        //visible inheritance
        Test.publicMethod();
        Test.protectedMethod();
        Test.defaultMethod();

    }
}