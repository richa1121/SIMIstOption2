package simistoption2;


import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richa
 */
public class Cybertorium extends JPanel implements ActionListener, KeyListener
{
    JButton table1, table2, table3, table4, table5;
    private Timer CybTimer;
    private Player player1;
    double x=0, y=0, velx=0, vely;
    public JButton mfloor;
    
    public Cybertorium()
    {
        super();
        
        CybTimer = new Timer (50, this);
       CybTimer.start();
       
       
       
      
       mfloor= new JButton("Return to Floor 1");
       
       
        table1 = new JButton();
        table2 = new JButton();
        table3 = new JButton();
        table4 = new JButton();
        table5 = new JButton();
        
        player1= new Player();
       
        add(mfloor);
        
        add(table1);
        add(table2);
        add(table3);
        add(table4);
        add(table5);
        
        table1.setOpaque(false);
        table1.setContentAreaFilled(false);
        table1.setBorderPainted(false);
        table2.setOpaque(false);
        table2.setContentAreaFilled(false);
        table2.setBorderPainted(false);
        table3.setOpaque(false);
        table3.setContentAreaFilled(false);
        table3.setBorderPainted(false);
        table4.setOpaque(false);
        table4.setContentAreaFilled(false);
        table4.setBorderPainted(false);
        table5.setOpaque(false);
        table5.setContentAreaFilled(false);
        table5.setBorderPainted(false);
        
        table1.setBounds(new Rectangle (90, 92, 805, 10));
        table2.setBounds(new Rectangle (90, 182, 805, 5));
        table3.setBounds(new Rectangle (90, 255, 805, 5));
        table4.setBounds(new Rectangle (90, 335, 805, 5));
        table5.setBounds(new Rectangle (90, 410, 805, 15));
        
        this.addKeyListener(this);
         requestFocusInWindow();
       this.setFocusable(true);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
         g.clearRect(0, 0, this.getWidth(), this.getHeight());
        ImageIcon Icon = new ImageIcon("cybertorium.jpg");
        g.drawImage(Icon.getImage(), 0, 0, this);
        player1.paintComponent(g);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
       Object o = e.getSource();
       
       if(o == CybTimer){
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
