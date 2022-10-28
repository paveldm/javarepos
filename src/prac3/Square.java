package prac3;

public class Square extends Rectangle {
    public Square() {
        this.width = 2;
        this.length = 2;
    }

    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double side) {
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square:\n" + "Side: " + this.width + ", color: "+ this.color + ", filled: " + this.filled;
    }
}