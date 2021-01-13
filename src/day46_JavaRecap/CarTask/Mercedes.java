package day46_JavaRecap.CarTask;

public final class Mercedes extends Car{
    //2 reason after extent one class 1 - class is final. 2-Constructor class


    public Mercedes( String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }
    @Override//override annotation
    public void start(){
        System.out.println("Starting "+brand+" "+model+" by pushing start button");
    }

}
