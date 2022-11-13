package lab4;

public class Main {
    public static void main(String args[]) {
        Priceable price1 = new Car("KIA", "yellow", 1500000);
        price1.getPrice();

        Priceable price2 = new Phone("Samsung", "dark blue", 50000);
        price2.getPrice();
    }
}
