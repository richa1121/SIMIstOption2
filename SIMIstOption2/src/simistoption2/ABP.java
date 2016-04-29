/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simistoption2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author sns5408
 */
public class ABP extends JPanel implements ActionListener, KeyListener{
    
    private Image floorImage;
   private Timer ABPTimer;
   private Player player1;
   
   public static final int COUNTERWIDTH = 160;
    public static final int COUNTERHEIGHT = 192;
    public static final int COFFEEWIDTH = 309;
    public static final int COFFEEHEIGHT = 40;
    public static final int SIGNWIDTH = 50;
    public static final int SIGNHEIGHT = 45;
    public static final int TRASHWIDTH = 114;
    public static final int TRASHHEIGHT = 62;
    public static final int BAKERYWIDTH = 50;
    public static final int BAKERYHEIGHT = 150;
    public static final int FRUITWIDTH = 75;
    public static final int FRUITHEIGHT = 65;
    public static final int SOUPWIDTH = 144;
    public static final int SOUPHEIGHT = 40;
    public static final int COOLERWIDTH = 310;
    public static final int COOLERHEIGHT = 30;

    private Rectangle counter;
    private Rectangle coffee;
    private Rectangle sign;
    private Rectangle trash;
    private Rectangle bakery;
    private Rectangle fruit;
    private Rectangle soup;
    private Rectangle cooler;
    private Rectangle exitOutside;
    private Rectangle exitCompSci;

    private JLabel temp = new JLabel();

    public ABP(){
       super();
       ABPTimer = new Timer (50, this);
       ABPTimer.start();

        player1 = new Player();

        this.addKeyListener(this);
        requestFocusInWindow();
        this.setFocusable(true);
   }
       
    /*@Override
    protected void paintComponent(Graphics g) {
        setPreferredSize(getParent().getSize());
        super.paintComponent(g);
        double playerHeight = getParent().getHeight() * .125;
        double playerWidth = getParent().getWidth() * .06;
        g.drawImage(new ImageIcon("floor.png").getImage(), 0, 0, getParent().getWidth(), getParent().getHeight(), null);
    }*/
   
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        ImageIcon Icon = new ImageIcon("floor.png");
        g.drawImage(Icon.getImage(), 0, 0, this);
        player1.paintComponent(g);
        
        
    }
   
    /*public void paintComponent(Graphics g){
        super.paintComponent(g);
         g.clearRect(0, 0, this.getWidth(), this.getHeight());
        ImageIcon Icon = new ImageIcon("floor tiles.jpg");
        g.drawImage(Icon.getImage(), 0, 0, this);
        player1.paintComponent(g);
        
        
    }*/
    
    public void actionPerformed(ActionEvent e){
       Object o = e.getSource();
       
       if(o == ABPTimer){
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
