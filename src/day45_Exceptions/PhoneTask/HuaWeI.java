package day45_Exceptions.PhoneTask;

public final class HuaWeI extends Phone{
    public HuaWeI( String model,  double price) {
        super("HuaWei", model, "china", price);
    }
    public void spy(){
        System.out.println(brand+" "+model+" is spying");
    }
}
