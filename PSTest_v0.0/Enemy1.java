import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy1 extends Enemies
{
    GreenfootImage image1 = new GreenfootImage("pirate1_img1.png");
    GifImage gif = new GifImage("pirate1_gif.gif");
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy1(){
    
    }
    public void act()
    {
        setImage(gif.getCurrentImage());
        move(getSpeed());
        isShot();
        isFighting();
        isDead();
        
    }
}
