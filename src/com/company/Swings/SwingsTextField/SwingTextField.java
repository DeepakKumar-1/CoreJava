package com.company.Swings.SwingsTextField;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyFrame extends JFrame {
    MyFrame(){
        JTextField tf1 = new JTextField(15);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField tf2 = new JFormattedTextField(df);

        tf2.setColumns(15);
        tf2.setValue(new Date());
        setLayout(new FlowLayout());

        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        JFormattedTextField tf3 = new JFormattedTextField(nft);
        tf3.setColumns(15);

        JTextArea ta = new JTextArea(30, 30);
        ta.copy();
        ta.paste();

        add(tf1);
        add(tf2);
        add(tf3);
        add(ta);
    }
}
public class SwingTextField {
    public static void main(String []args){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
