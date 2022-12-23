package lab3;
public class Main {
    public static void main(String[] args) {
        Dish d1 = new Plate("clay", "blue", 15);
        System.out.println(d1);

        Dish d2 = new Cup("ceramics", "white", 250);
        System.out.println(d2);

        Dish d3 = new Bowl("glass", "transparent", 1000);
        System.out.println(d3);
    }
}