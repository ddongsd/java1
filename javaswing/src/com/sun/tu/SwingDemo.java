package com.sun.tu;

import java.awt.*;

import javax.swing.*;
public class SwingDemo extends JFrame{
    public static void main(String[] args) {
       new SwingDemo().creat();
    }
    private void creat()
    
    {
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds((int)(d.getWidth()/4),(int)(d.getHeight()/4),(int)(d.getWidth()/2), (int)(d.getHeight()/2));
        
    }
}
