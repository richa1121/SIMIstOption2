/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simistoption2;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author sns5408
 */
public class Frame extends JFrame {
    

    
    public Frame()
    {
        super ("IST SIM");
        JPanelMain p1 = new JPanelMain();
        getContentPane().add(p1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (900, 700);
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

    

