package simistoption2;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Player extends Rectangle{
        private int dx;
        private int dy;
        private Image playerImage = new ImageIcon("down1.png").getImage();
         
        public Player(){
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
            g.drawImage(playerImage, this.x, this.y, null);
        }

}
   
   
   
   