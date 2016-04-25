/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 *
 * @author matthewtucker
 */
public class MainFloor extends JPanel implements ActionListener, KeyListener{

   
    private Timer refreshTimer;
   private Point room1, room2, room3;
  
    private player player1;
    private JButton test;
    

    public MainFloor() {
       test=new JButton("test");
       add(test);
        this.addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
 

        g.clearRect(0, 0, this.getWidth(), this.getHeight());

     
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();

        if (o == refreshTimer) {
            this.repaint();
        }
    }

    public void keyTyped(KeyEvent e) {
        
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player1.setDx(-20);

            System.out.println("Typed");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player1.setDx(20);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            player1.setDy(-20);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player1.setDy(20);
        }
    }

    public void keyReleased(KeyEvent e) {
        player1.setDx(0);
        player1.setDy(0);
    }

    private class player extends Rectangle {

        private int dx;
        private int dy;

        public player() {
            this.dx = 0;
            this.dy = 0;
            this.setBounds(200, 50, 30, 30);
        }

        public void move() {
            this.x += dx;
            this.y += dy;
        }

        public void setDx(int dx) {
            this.dx = dx;
        }

        public void setDy(int dy) {
            this.dy = dy;
        }

        public void paintComponent(Graphics g) {
            move();
            g.drawRect(x, y, 30, 30);
        }
    }
}
