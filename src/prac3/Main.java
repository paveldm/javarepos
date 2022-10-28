package prac3;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(7, "Black", false);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.getColor());
        System.out.println(c.isFilled());

        Shape r = new Rectangle(3.0, 5.0, "Green", true);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.getColor());

        Shape s = new Square(10);
        System.out.println(s);
        System.out.println(s.getArea());
        System.out.println(s.getColor());
    }
}
