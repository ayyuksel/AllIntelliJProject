package day41_Encapsulation;

public class Login {
    public static void main(String[] args) {//3B
        Credentials obj = new Credentials();

        // System.out.println( obj.userName );
        //  obj.userName = "ABC";
        // System.out.println( obj.userName );

        System.out.println( obj.getUserName()  );

        System.out.println( obj.getPassWord() );

        //  obj.getPassWord() = 1233456;  Read ONLY

        //   obj.userName = "HI";

        obj.setUserName("Hello");

        System.out.println( obj.getUserName() );

        obj.setPassWord(789456);
        System.out.println( obj.getPassWord());



    }

}