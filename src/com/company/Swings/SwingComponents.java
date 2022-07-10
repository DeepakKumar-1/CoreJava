package com.company.Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;
    MyFrame(){
        super("Swing Demo");
        setLayout(new FlowLayout());
        l = new JLabel("clicked " + count + " Times");
        b = new JButton("click");
        b.addActionListener(this);
        add(l);
        add(b);
//        add(new JButton("Cancel"));
        getRootPane().setDefaultButton(b);

//        b.setIcon(new ImageIcon(""));
        l.setToolTipText("Counter");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked " + count + " Times");
    }
}
public class SwingComponents {
    public static void main(String []args){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
