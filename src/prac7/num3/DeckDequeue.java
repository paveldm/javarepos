package prac7.num3;

import java.util.Deque;
import java.util.LinkedList;

public class DeckDequeue {
    private Deque<Integer> deck = new LinkedList<>();

    public void del(){
        deck.remove();
    }

    public Integer TopCard() {
        return deck.peek();
    }

    public void addBottom(Integer card){
        deck.offer(card);
    }

    public String toString(){
        return "" + deck;
    }

    public Deque<Integer> getDeck() {
        return deck;
    }
}