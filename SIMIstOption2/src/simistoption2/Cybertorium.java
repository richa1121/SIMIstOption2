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
    private Player player;
    double x=0, y=0, velx=0, vely;
    
    public Cybertorium()
    {
        table1 = new JButton();
        table2 = new JButton();
        table3 = new JButton();
        table4 = new JButton();
        table5 = new JButton();
        
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
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon Icon = new ImageIcon("cybertorium.jpg");
        g.drawImage(Icon.getImage(), 0, 0, this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        final int rightBound = 1120;
        final int leftBound = 0;
        final int lowerBound = 0;
        final int upperBound = 600;
        repaint();
        revalidate();
        player.x += velx;
        player.y += vely;
        if (player.x > rightBound){
            player.x = rightBound;
            
        }
        if (player.x < leftBound){
            player.x = leftBound;
        }
        if (player.y > upperBound){
            player.y = upperBound;
        }
        if (player.y < lowerBound){
            player.y = lowerBound;
        }
    }
    
    public void up(){
        vely = -1.5;
        velx = 0;
    }
    
    public void down(){
        vely = 2;
        velx = 0;
    }
        
    public void left(){
        velx = -1.5;
        vely = 0;
        
    }
    
    public void right(){
        velx = 2;
        vely = 0;    
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
