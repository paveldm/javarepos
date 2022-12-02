package prac7.num1;

import java.util.Stack;

public class DeckStack {
    private Stack<Integer> deck = new Stack<>();

    public void del(){
        deck.remove(0);
    }

    public Integer topCard() {
        return deck.get(0);
    }

    public void addBottom(Integer card){
        deck.push(card);
    }

    public Stack<Integer> getDeck() {
        return deck;
    }

    public String toString(){
        return "" + deck;
    }
}
