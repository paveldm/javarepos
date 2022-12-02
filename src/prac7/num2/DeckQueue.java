package prac7.num2;

import java.util.*;

public class DeckQueue {
    private Queue<Integer> deck = new LinkedList<>();

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

    public Queue<Integer> getDeck() {
        return deck;
    }
}