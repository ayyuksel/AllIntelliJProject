package day40_Constructor;

public class ConstructorIntro {
    //Constructor is mandatory if you don't create one compiler create one by default
    //One with without any argument
    //static block run one time and  will be first one to run
    static int b;
    static {
        System.out.println("static block");
        b=200;
    }
    public ConstructorIntro(int a){

        System.out.println("constructor with int arg");
        b=200;
        this.a =a;
    }
    int a =10;
    public static void main(String[] args) {

        System.out.println("Hello");
        //System.out.println(a);
        int num = new ConstructorIntro(10).a;

        ConstructorIntro obj2 = new ConstructorIntro(300);
        ConstructorIntro obj3 = new ConstructorIntro(400);
    }
}
