/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.minedzone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author ARNOL
 */
public class Mine {
    protected int x,y;
    protected boolean state;
    protected Mine next,back;
    protected Zone z;
    public Mine(int posx,int posy, Zone zone){
    x = posx;
    y = posy;
    state = false;
    next = null;
    back = null;
    z = zone;
}
    public void paint(Graphics g, boolean current){
        Image image;
        if(state == false){
            image = Toolkit.getDefaultToolkit().getImage("E:\\images/mine.png");
        }else{
           image = Toolkit.getDefaultToolkit().getImage("E:\\images/boom.png"); 
        }
        g.drawImage(image, x-24, y-24, z);
        
        if(current == true){
            g.setColor(Color.RED);
        }else{
            g.setColor(Color.WHITE);
        }
        g.drawRect(x- 25, x-25, 50, 50);
        
    }
}
