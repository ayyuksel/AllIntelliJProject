package day39_StaticBlock;

public class Carpet {
    public double with, length, unitPrice;
    boolean isPersian;

    public void customOrder(double with, double length, double unitPrice, boolean isPersian) {
        this.with = with;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        double totalPrice = (with * length) * unitPrice;
        return (isPersian) ? totalPrice += 200 : totalPrice;
    }


    public String toString() {
        return "Carpet{" +
                "with=" + with +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= "+calcCost()+
                '}';
    }
}
