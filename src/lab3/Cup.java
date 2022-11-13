package lab3;

public class Cup extends Dish {
    private int volume;
    public Cup(String material, String color, int volume){
        super(material, color);
        this.volume = volume;
    }

    public String toString(){
        return "Cup:\n" + "Материал: " + super.getMaterial() + ", Цвет: " + super.getColor() + ", Объем: " + volume + "ml";
    }
}
