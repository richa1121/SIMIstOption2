/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simistoption2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Richa
 */
public class Player extends Rectangle{  
    private ImageIcon playerImage;
    //private final int playerImageSize;
    private Image ResizedPlayerImage;
    
    public Player(int width, int height){
        playerImage = new ImageIcon("down1.jpg");
        ResizedPlayerImage = playerImage.getImage();    
    }
    
    public void DrawRat(Graphics g) {
        g.drawImage(ResizedPlayerImage, this.x, this.y, null);
    }
    
    /*public final void Invert(){
        playerImage = new ImageIcon("");
        ResizedPlayerImage = playerImage.getImage();
    }
    
     public final void RightOrient(){
        playerImage = new ImageIcon("");
        ResizedPlayerImage = playerImage.getImage();
    }*/
}
