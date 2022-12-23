package lab4;
public class Car implements Priceable{
    private String brand;
    private String color;
    private double price;
    Car(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    @Override
    public String getPrice() {
        System.out.println("Машина:\n" + "Цена: " + price + ", марка: " + brand + ", цвет: " + color);
        return "";
    }
}