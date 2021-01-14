package day48_Abstraction;

public interface InterfaceRules {
    int a = 100; // public static final by default

    //static {}not allowed to interface
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceRules.a);
    }

    public default void m() {

    }

    //a=100;by default it is final
}
    //interface can not have object
    //What we cannot have
    //constructor
    //instance method
    //instance variables
    //blocks

    //What we can have
    //variables: public static and final by default
    //abstract method
    //static method
    //default method: only use in interface, you cannot cal at subclass


