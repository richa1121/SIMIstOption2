package simistoption2;


import java.awt.Graphics;
import java.awt.Rectangle;

public class player extends Rectangle{
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
   
   
   
   