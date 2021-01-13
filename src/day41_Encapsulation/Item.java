package day41_Encapsulation;

public class Item {
//1A
    public String name;//instance variable
    public int quantity;
    public double unitPrice;

    public Item(String name, int quantity, double unitPrice) {
        this.name = name;//local variable
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

//if you using instance variable method should be instance
    public double calcCost() {
        return quantity * unitPrice;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice $"+ calcCost()+
                '}';
    }
}