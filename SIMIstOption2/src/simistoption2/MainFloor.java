package simistoption2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 



import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author matthewtucker
 */
public class MainFloor extends JPanel implements ActionListener, KeyListener {
  
   private Image floorImage;
   private Timer refreshTimer;
   private ArrayList<Room> rooms;
   private player player1;
   public JButton Cybertorium, Room208, Room201;
   
   
   
   public int dialogue;
   
   
   public MainFloor(){
       super();
       refreshTimer = new Timer (50, this);
       refreshTimer.start();
       
       //this.floorImage = floorImage;
       rooms = new ArrayList<>();
       rooms.add(new Room(3, 0,50));
       rooms.add(new Room(3, 0, 300));
       rooms.add(new Room(3, 0, 500));
       
       player1 = new player();
     
    Cybertorium = new JButton("Cybertorium");
    Room208 = new JButton ("Room 208");
    Room201= new JButton ("Room 201");
    
    add(Cybertorium);
    Cybertorium.setLocation(0, 50);
    
    add(Room208);
    Room208.setLocation(0, 300);
    
    add(Room201);
    Room201.setLocation(0, 500);
    
    
    Room208.setEnabled(false);
    Cybertorium.setEnabled(false);
    Room201.setEnabled(false);
       
       this.addKeyListener(this);
       requestFocusInWindow();
       this.setFocusable(true);
        
   }
   
   
   public void paintComponent(Graphics g){
       super.paintComponent(g);
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
       for(int i = 0; i < rooms.size();i++){
           rooms.get(i).paintComponent(g);
       }
       player1.paintComponent(g);
       
       
       for(int i = 0; i<rooms.size();i++){
          if(!player1.intersects(rooms.get(0))){
                   Cybertorium.setEnabled(false);
                   
               }
          if(!player1.intersects(rooms.get(1))){
                   Room208.setEnabled(false);
                   
               }
if(!player1.intersects(rooms.get(2))){
                   Room201.setEnabled(false);
                   
               }
          
          if(player1.intersects(rooms.get(i))){
           
              if(player1.intersects(rooms.get(0))){
            Cybertorium.setEnabled(true);
                    }
               if(player1.intersects(rooms.get(1))){
            Room208.setEnabled(true);
                    }
                if(player1.intersects(rooms.get(2))){
            Room201.setEnabled(true);
                    }
           
          }
  
          }
          
       }
       
   
   
   public void actionPerformed(ActionEvent e){
       Object o = e.getSource();
       
       if(o == refreshTimer){
           this.repaint();
       }
   }  
    public void keyPressed(KeyEvent e){
       if(e.getKeyCode()== KeyEvent.VK_LEFT){
        player1.setDx(-20);
       
        System.out.println("Typed");
       }
       
       else if(e.getKeyCode() ==KeyEvent.VK_RIGHT){
           player1.setDx(20);
       }
        else if(e.getKeyCode() ==KeyEvent.VK_UP){
           player1.setDy(-20);
        }
            else if(e.getKeyCode() ==KeyEvent.VK_DOWN){
           player1.setDy(20);
            }
    }   
    
    public void keyReleased(KeyEvent e){
        player1.setDx(0);
        player1.setDy(0);
    }
    public void keyTyped(KeyEvent e){
        
    }
    
    public void addPlayerToFloor(){
        
    }
   
   
    
    
    
    
    
   /* private class player extends Rectangle{
         private int dx;
         private int dy;
        public player(){
            this.dx = 0;
            this.dy = 0;
            this.setBounds(100, 50, 30, 30);
        }
        
        public void move(){
            this.x+=dx;
            this.y+=dy;
        }
        
        public void setDx(int dx){
            this.dx = dx;
        }
         public void setDy(int dy){
            this.dy = dy;
        }
        public void paintComponent(Graphics g){
            move();
            g.drawRect(x, y, 30, 30);
        }
    }
   
   */
   
   
   
   
   private class Room extends Rectangle{
       private int roomNum;
       private int floor;
       private int capacity;
       private int xLocation;
       private int yLocation;
      
       private Image floorImage1; 
       private Image couch1;
       private Image table;
       private Image computer;
       private Image door;
       
      /*private Artifacts artifact1;
       private Artifacts artifact2;
       private Artifacts artifact3;
       */
       
       private Image couchInward;
       private Image couchInward2;
       private Image couchInward3;
      
      
       
       
       //private JPanel roomView;
       
       public Room(int roomNum, int x, int y){
           this.roomNum = roomNum;
           //this.roomView = roomView;
           this.xLocation = x;
           this.yLocation = y;
           this.capacity = 50;
           this.floor = 1;
           
           
 
           
          ImageIcon floorIcon1 = new ImageIcon("floor tiles.png");
           floorImage1 = floorIcon1.getImage().getScaledInstance(1000, 1000, Image.SCALE_DEFAULT);
         
           
         
           ImageIcon couchIcon1 = new ImageIcon("couch.png");
           couch1 = couchIcon1.getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT);
           
      
           
           ImageIcon tableIcon1 = new ImageIcon("Table pixel.png");
           table = tableIcon1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
           
           ImageIcon computerIcon1 = new ImageIcon("New Piskel.png");
           computer= computerIcon1.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
           
           ImageIcon doorIcon = new ImageIcon("Door.png");
           door= doorIcon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
           
           /*artifact1 = new Artifacts("Couch", 500, 50, couch1);
           
           artifact2 = new Artifacts("Table", 500, 75, table);
           
           artifact3 = new Artifacts("Computer", 200, 400, computer);
           */
           
           
         
           ImageIcon couchIcon2 = new ImageIcon("couchIn.png");
           couchInward = couchIcon2.getImage().getScaledInstance(50, 90, Image.SCALE_DEFAULT);
           
           ImageIcon couchIcon3 = new ImageIcon("couchIn2.png");
           couchInward2 = couchIcon3.getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT);
          
           ImageIcon couchIcon4 = new ImageIcon("couchIn3.png");
           couchInward3 = couchIcon4.getImage().getScaledInstance(50, 90, Image.SCALE_DEFAULT);
                     
          /* ImageIcon tableIcon1 = new ImageIcon("Table pixel.png");
           table = tableIcon1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
           */
           this.setBounds(this.xLocation, this.yLocation, 30, 30);
       }
       
       public void paintComponent(Graphics g){
           
           g.drawImage(floorImage1, 0, 0, null);
  
       g.drawImage(door, 0, 50, null); 
       g.drawImage(door, 0, 300, null);
          g.drawImage(door, 0, 500, null);
          
          
           g.drawImage(couch1, 300, 200, null);
           g.drawImage(couch1, 400, 200, null);
           g.drawImage(couch1, 500, 200, null);
           g.drawImage(couchInward, 600, 250, null);
           g.drawImage(couchInward, 600, 340, null);
           g.drawImage(couchInward, 600, 430, null);
           g.drawImage(couchInward2, 500, 520, null);
           g.drawImage(couchInward2, 400, 520, null);
           g.drawImage(couchInward2, 300, 520, null);
           g.drawImage(couchInward2, 200, 520, null);
           g.drawImage(couchInward3, 150, 250, null);
           g.drawImage(couchInward3, 150, 340, null);
           g.drawImage(couchInward3, 150, 430, null);
           
           g.drawImage(table, 350, 300, null);
           
           

// Artifact Drawing and collision testing. 
         /* artifact1.Draw(g);
           artifact2.Draw(g);
           artifact3.Draw(g);
           if(player1.intersects(artifact1)){
               System.out.println("Collision Successful");
               //add method to stop motion later if needed
           
           }
           if (player1.intersects(artifact3)){
               System.out.println("Logging into computer");
           }*/
          
           
       }
       
       public int getNum(){
           return this.roomNum;
       }
   }
}
