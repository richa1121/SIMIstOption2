/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simistoption2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    
    public JPanelMain(){
        super();
        
         setLayout(new BorderLayout());
         setFocusable(true);
        s1 = new StartPane();
       c1 = new Cybertorium();
       m1 = new MainFloor();
      
       
       s1.Start.addActionListener(this);
       m1.Cybertorium.addActionListener(this);
       m1.Room201.addActionListener(this);
       
        
        add(s1);
        
        
       
        
        
    }
    
    
    
    public void AddPanels(){
        add(s1);
        add(c1);
        repaint();
        revalidate();
        
       
    }
    public void RemovePanels(){
        remove(s1);
        remove(m1);
        remove(c1);
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
      if(obj == s1.Start){
          
      
          RemovePanels();
      add(m1);
       m1.requestFocusInWindow();
       m1.setFocusable(true);
     
      }
       if(obj == m1.Cybertorium){
           RemovePanels();
           add(c1);
           c1.requestFocusInWindow();
           m1.setFocusable(true);
           
       }
      
      }
   
     
     
}
