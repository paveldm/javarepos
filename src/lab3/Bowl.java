package lab3;
public class Bowl extends Dish {
    private int volume;
    public Bowl(String material, String color, int volume){
        super(material, color);
        this.volume = volume;
    }
    public String toString(){
        return "Bowl:\n" + "Материал: " + super.getMaterial() + ", Цвет: " + super.getColor() + ", Объем: " + volume + "ml";
    }
}