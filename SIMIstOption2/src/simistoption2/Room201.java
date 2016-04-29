/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simistoption2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Richa
 */
public class Room201 extends JPanel implements ActionListener, KeyListener
{

    private Timer roomTimer;
    public JButton mfloor;   
    private Player player1;
    double x=0, y=0, velx=0, vely;
    
    public Room201()
    {
        super();
        
        roomTimer = new Timer (50, this);
        roomTimer.start();
        
        player1= new Player();
        
        mfloor= new JButton("Return to Floor 1");
        add(mfloor);
        
        this.addKeyListener(this);
        requestFocusInWindow();
        this.setFocusable(true);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
         g.clearRect(0, 0, this.getWidth(), this.getHeight());
        ImageIcon Icon = new ImageIcon("room201.png");
        g.drawImage(Icon.getImage(), 0, 0, this);
        player1.paintComponent(g);
    }
    
    public void actionPerformed(ActionEvent e){
       Object o = e.getSource();
       
       if(o == roomTimer){
           this.repaint();
       }
   }  
     public void keyPressed(KeyEvent e){
       if(e.getKeyCode()== KeyEvent.VK_LEFT){
        if(player1.x < 0){
           player1.x=0;
       } 
        player1.setDx(-20);
        
       
        System.out.println("Typed");
       }
       
       else if(e.getKeyCode() ==KeyEvent.VK_RIGHT){
           if(player1.x > 850){
           player1.x=850;
       } 
           player1.setDx(20);
       }
        else if(e.getKeyCode() ==KeyEvent.VK_UP){
         if(player1.y < -10){
           player1.y=-10;
       }    
           player1.setDy(-20);
        }
            else if(e.getKeyCode() ==KeyEvent.VK_DOWN){
                 if(player1.y > 700){
           player1.y=630;
       }    
           player1.setDy(20);
            }
    }   
      
    
    public void keyReleased(KeyEvent e){
        player1.setDx(0);
        player1.setDy(0);
    }
    public void keyTyped(KeyEvent e){
        
    }
}
