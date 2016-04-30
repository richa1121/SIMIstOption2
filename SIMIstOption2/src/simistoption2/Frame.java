/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simistoption2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.WindowFocusListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sns5408
 */
public class Frame extends JFrame {
    
    JButton b1;
    JLabel l1;
    
    public Frame()
    {
        super ("IST SIM");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanelMain p1 = new JPanelMain();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("IST_Building_PSU.jpg"));
        getContentPane().setLayout(new FlowLayout ());
        getContentPane().add(label);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (675, 600);
        setResizable(true);
        setVisible(true);  
        
        
        /*JFrame f = new JFrame();
        Cybertorium c = new Cybertorium();
        //StartPane sP = new StartPane();
        f.add(c);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200,700);
        f.setResizable(false); */
        
    }
}

    

