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
        
        
        JFrame f = new JFrame();
        MainFloor mf = new MainFloor();
        f.add(mf);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200,700);
        f.setResizable(false);
        
    }
}

    

