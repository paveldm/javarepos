package lab6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab6 extends JFrame {
    public Lab6() {
        super("BorderLayoutTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 250);
        Container container = getContentPane();
        JButton jLabel1 = new JButton("North");
        container.add(jLabel1, BorderLayout.NORTH);
        jLabel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в");
            }
        });
        JButton jLabel2 = new JButton("West");
        container.add(jLabel2, BorderLayout.WEST);
        jLabel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Джидда");
            }
        });
        JButton jLabel3 = new JButton("South");
        container.add(jLabel3, BorderLayout.SOUTH);
        jLabel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Абха");
            }
        });
        JButton jLabel4 = new JButton("East");
        container.add(jLabel4, BorderLayout.EAST);
        jLabel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Дахране");
            }
        });
        JButton jLabel5 = new JButton("Center");
        container.add(jLabel5, BorderLayout.CENTER);
        jLabel5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в");
            }
        });
        setBounds(600, 450, 520, 600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Lab6();
    }
}
