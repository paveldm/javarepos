package lab5;

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Lab5 extends JFrame {
    public static void main(String[] args) {
        System.out.println("Введите полный путь файла: ");
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();
        JFrame Lab5 = new JFrame();
        Lab5.setTitle("Image");
        Lab5.setLayout(null);
        Lab5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lab5.setBounds(0, 0, 520, 600);
        Lab5.setLocationRelativeTo(null);
        Container c = Lab5.getContentPane();

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(path));
        Dimension size = label.getPreferredSize();
        label.setBounds(1, 10, size.width, size.height);

        c.add(label);
        Lab5.setVisible(true);
    }
}
