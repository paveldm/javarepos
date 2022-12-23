package lab2;
public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("head", "hand", "leg");
        Human.Head head = human.new Head();
        Human.Hand hand = human.new Hand();
        Human.Leg leg = human.new Leg();
        head.out_head();
        hand.out_hand();
        leg.out_leg();
    }
}