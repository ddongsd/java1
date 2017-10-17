package com.sun.tu;

import java.awt.*;
import java.io.Console;
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


class CoCo {

    public static void main(String[] args) {
        Console console = System.console();  
        String password ;  
        password = new String(console.readPassword());  
        System.out.println("password="+password); 
        
        String[][] temp=new String[99][];
        for(int i=0;i<9;i++)
        {
            temp[i]=new String[3];
            for(int j=0;j<2;j++)
            {
                temp[i][j]=new String("yuyuWW");
            }
        }
        for(int i=0;i<19;i++)
        {
            if(temp[i]!=null)
                System.out.println(temp[i].length); 
            else
            {
                System.out.println(i);
                break;
            }
        }
       

    }

}

