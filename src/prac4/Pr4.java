package prac4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pr4 extends JFrame {
    JButton btn1 = new JButton("AC Milan");
    JButton btn2 = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    int score1 = 0;
    int score2 = 0;

    Pr4() {
        super("App");
        setLayout(new FlowLayout());
        setSize(500, 100);
        setVisible(true);

        add(btn1);

        btn1.addMouseListener(
                new MouseListener() {
                    public void mouseClicked(java.awt.event.MouseEvent a) {
                        score1++;
                        result.setText("Result: " + score1 + " X " + score2);
                        lastScorer.setText("Last Scorer: AC Milan");
                        if (score1 > score2) {
                            winner.setText("Winner: AC Milan");
                        } else if (score1 == score2) {
                            winner.setText("Winner: DRAW");
                        }
                    }
                    public void mousePressed(java.awt.event.MouseEvent a) {}
                    public void mouseReleased(java.awt.event.MouseEvent a) {}
                    public void mouseEntered(java.awt.event.MouseEvent a) {}
                    public void mouseExited(java.awt.event.MouseEvent a) {}
                }
        );

        btn2.addMouseListener(
                new MouseListener() {
                    public void mouseClicked(java.awt.event.MouseEvent a) {
                        score2++;
                        result.setText("Result: " + score1 + " X " + score2);
                        lastScorer.setText("Last Scorer: Real Madrid");
                        if (score2 > score1) {
                            winner.setText("Winner: Real Madrid");
                        } else if (score1 == score2) {
                            winner.setText("Winner: DRAW");
                        }
                    }
                    public void mousePressed(java.awt.event.MouseEvent a) {}
                    public void mouseReleased(java.awt.event.MouseEvent a) {}
                    public void mouseEntered(java.awt.event.MouseEvent a) {}
                    public void mouseExited(java.awt.event.MouseEvent a) {}
                }
        );

        add(btn2);
        add(result);
        add(lastScorer);
        add(winner);
    }

    public static void main(String[] args) {
        new Pr4();
    }
}