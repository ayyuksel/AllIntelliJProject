package day45_Exceptions.PhoneTask;

public class Walmart {//walmart has an iphone
    public static void main(String[] args) {
        long number =911;
        Iphone iphone = new Iphone("12", 1300);
        Samsung samsung = new Samsung("S20",1200);
        Nokia nokia =new Nokia("Brick", 70);
        HuaWeI huaWeI = new HuaWeI("iSpy", 300);

        iphone.call(number);
        samsung.call(number);
        nokia.call(number);
        huaWeI.call(number);

        System.out.println("iphone = " + iphone);
        System.out.println("samsung = " + samsung);
        System.out.println("nokia = " + nokia);
        System.out.println("huaWeI = " + huaWeI);

        iphone.faceTime(123456);
        iphone.faceTime("a.jlls@gmail.com");
        samsung.freeze();
        nokia.selfDefense();

        huaWeI.spy();
    }
}
