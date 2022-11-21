package prac7.num1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DeckStack deck1 = new DeckStack();
        for(int i = 0; i < 5; i++) {
            int num = in.nextInt();
            deck1.add_bottom(num);
        }
        DeckStack deck2 = new DeckStack();
        for(int i = 0; i < 5; i++){
            int num = in.nextInt();
            deck2.add_bottom(num);
        }
        System.out.println(deck1);
        System.out.println(deck2 + "\n");
        int step = 0;
        while(true){
            step++;
            if(srav(deck1.topCard(), deck2.topCard()) == 1){
                if(step % 2 == 1){
                    deck1.add_bottom(deck1.topCard());
                    deck1.add_bottom(deck2.topCard());
                }
                else{
                    deck1.add_bottom(deck2.topCard());
                    deck1.add_bottom(deck1.topCard());
                }
                deck1.del();
                deck2.del();
            }
            else if(srav(deck1.topCard(), deck2.topCard()) == -1){
                if(step % 2 == 1){
                    deck2.add_bottom(deck1.topCard());
                    deck2.add_bottom(deck2.topCard());
                }
                else{
                    deck2.add_bottom(deck2.topCard());
                    deck2.add_bottom(deck1.topCard());
                }
                deck1.del();
                deck2.del();
            }
            if(deck1.getDeck().empty()){
                System.out.println("second " + step);
                break;
            }
            if(deck2.getDeck().empty()){
                System.out.println("first " + step);
                break;
            }
            if(step == 106){
                System.out.println("Botva");
                break;
            }
        }
    }

    public static int srav(int a, int b){
        if(a == 0 && b == 9) return 1;
        else if (a == 9 && b == 0) return -1;

        if(a > b) return 1;
        else if (a < b) return -1;
        else return 0;
    }
}