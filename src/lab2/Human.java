package lab2;
public class Human {
    private String head;
    private String hand;
    private String leg;
    public Human(String head, String hand, String leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }
    public class Head{
        public void out_head() {
            System.out.println("Head");
        }
    }
    public class Hand{
        public void out_hand() {
            System.out.println("Hand");
        }
    }
    public class Leg{
        public void out_leg() {
            System.out.println("Leg");
        }
    }
}