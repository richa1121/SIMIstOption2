/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simistoption2;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sns5408
 */
public class JPanelMain extends JPanel implements ActionListener{
    
    StartPane s1;
    MainFloor m1;
    Cybertorium c1;
    ABP r1;
    Room201 r2;
    
    
    public JPanelMain(){
        super();
        
         setLayout(new BorderLayout());
         setFocusable(true);
        s1 = new StartPane();
       c1 = new Cybertorium();
       m1 = new MainFloor();
      r1 = new ABP();
      r2 = new Room201();
       
       s1.Start.addActionListener(this);
       
       c1.mfloor.addActionListener(this);
       
       m1.Cybertorium.addActionListener(this);
       m1.Room201.addActionListener(this);
       m1.ABP.addActionListener(this);
       
      r1.mfloor.addActionListener(this);
      r2.mfloor.addActionListener(this);
       
        
        add(s1);
       
        
        
    }
   
    

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        ImageIcon floor = new ImageIcon("IST_Building_PSU.png");
        int x = 0, y = 0;
        floor.paintIcon(this, g, x, y);

    
    }
    
    public void AddPanels(){
        add(s1);
        add(c1);
        repaint();
        revalidate();
   //addition     
       
    }
    public void RemovePanels(){
        remove(s1);
        remove(m1);
        remove(c1);
        remove(r1);
        remove(r2);
        
        repaint();
        revalidate();
    }
    public void SwitchtoCybertorium(){
       remove(m1);
        add(c1);
        repaint();
        revalidate();
    }
    
    
     public void actionPerformed(ActionEvent al)
      { Object obj = al.getSource();
      if( (obj == s1.Start) || (obj == c1.mfloor)) {
            RemovePanels();
            add(m1);
            m1.requestFocusInWindow();
            m1.setFocusable(true);
     
      }
       if(obj == m1.Cybertorium){
           RemovePanels();
           add(c1);
           c1.requestFocusInWindow();
           c1.setFocusable(true);
       }
       
       
        if(obj == m1.ABP){
           RemovePanels();
           add(r1);
           r1.requestFocusInWindow();
           r1.setFocusable(true);
       }
        
        if(obj == m1.Room201){
           RemovePanels();
           add(r2);
           r2.requestFocusInWindow();
           r2.setFocusable(true);
       }
        if(obj == r1.mfloor){
           RemovePanels();
           add(m1);
           m1.requestFocusInWindow();
           m1.setFocusable(true);
       }
        
        if(obj == r2.mfloor){
           RemovePanels();
           add(m1);
           m1.requestFocusInWindow();
           m1.setFocusable(true);
       }
    }
}
