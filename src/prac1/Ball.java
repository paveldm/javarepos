package prac1;

public class Ball {
    private int size;
    private String color;
    public Ball(int s, String c) {
        size = s;
        color = c;
    }
    public Ball(int s) {
        size = s;
        color = "green";
    }
    public Ball() {
        size = 100;
        color = "green";
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public int getSize() {
        return size;
    }
    public String toString() {
        return "Size: " + this.size + ", color: " + this.color;
    }
}