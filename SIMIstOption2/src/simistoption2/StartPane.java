/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simistoption2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author sns5408
 */
public class StartPane extends JPanel{
    
    public JButton Start; 
    private Image floorImage1; 
   
    public StartPane(){
       
        
        
        Start= new JButton("Start");
        
        add(Start);
        
                   
        ImageIcon floorIcon1 = new ImageIcon("IST_Building_PSU.png");
        floorImage1 = floorIcon1.getImage().getScaledInstance(1000, 1000, Image.SCALE_DEFAULT);
         
    }

    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(floorImage1, 0, 0, null);
    
    }
}

