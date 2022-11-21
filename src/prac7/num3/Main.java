package prac7.num3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DeckDequeue deck1 = new DeckDequeue();
        for(int i = 0; i < 5; i++) {
            int num = in.nextInt();
            deck1.add_bottom(num);
        }
        DeckDequeue deck2 = new DeckDequeue();
        for(int i = 0; i < 5; i++){
            int num = in.nextInt();
            deck2.add_bottom(num);
        }
        System.out.println(deck1);
        System.out.println(deck2 + "\n");
        int step = 0;
        while(true){
            step++;
            if(srav(deck1.TopCard(), deck2.TopCard()) == 1){
                if(step % 2 == 1){
                    deck1.add_bottom(deck1.TopCard());
                    deck1.add_bottom(deck2.TopCard());
                }
                else{
                    deck1.add_bottom(deck2.TopCard());
                    deck1.add_bottom(deck1.TopCard());
                }
                deck1.del();
                deck2.del();
            }
            else if(srav(deck1.TopCard(), deck2.TopCard()) == -1){
                if(step % 2 == 1){
                    deck2.add_bottom(deck1.TopCard());
                    deck2.add_bottom(deck2.TopCard());
                }
                else{
                    deck2.add_bottom(deck2.TopCard());
                    deck2.add_bottom(deck1.TopCard());
                }
                deck1.del();
                deck2.del();
            }
            if(deck1.getDeck().isEmpty()){
                System.out.println("second " + step);
                break;
            }
            if(deck2.getDeck().isEmpty()){
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