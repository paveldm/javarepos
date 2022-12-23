package prac1;
public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(5, "white");
        Ball ball2 = new Ball(7);
        System.out.println(ball1);
        ball2.setColor("red");
        System.out.println(ball2);
    }
}