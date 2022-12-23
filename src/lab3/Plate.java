package lab3;
public class Plate extends Dish {
    private int diameter;
    public Plate(String material, String color, int diameter){
        super(material, color);
        this.diameter = diameter;
    }
    public int getDiameter() {
        return diameter;
    }
    public String toString(){
        return "Plate:\n" + "Материал: " + super.getMaterial() + ", Цвет: " + super.getColor() + ", Диаметр: " + diameter + "cm";
    }
}