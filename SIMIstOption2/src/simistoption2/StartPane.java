/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simistoption2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author sns5408
 */
public class StartPane extends JPanel implements ActionListener{
    
    public JButton Start; 
    public StartPane(){
       
        
        
        Start= new JButton("Start");
        
        add(Start);
        
        
      Start.addActionListener(this);
       
        
        
    }
            @Override
            public void actionPerformed(ActionEvent e) {
                this.setVisible(false);
                 MainFloor mf = new MainFloor();
                 mf.setVisible(true);
    
    
    
}
 }
