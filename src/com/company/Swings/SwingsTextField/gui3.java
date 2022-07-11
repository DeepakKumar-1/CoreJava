package com.company.Swings.SwingsTextField;

import javax.swing.*;
class gui3
{
    public static void main(String []args)
    {
        JFrame f= new JFrame("Write Something");

/*Java JTextArea
The object of a JTextArea class is a multi line region that displays text.
 It allows the editing of multiple line text.*/
        JTextArea area;
        area=new JTextArea();
        area.setBounds(20,75,250,200);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}