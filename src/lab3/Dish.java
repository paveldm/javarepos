package lab3;

public abstract class Dish {
    private String material;
    private String color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public Dish() {
        this.material = "ceramics";
        this.color = "white";
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
    public abstract String toString();
}
