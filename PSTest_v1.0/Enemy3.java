import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy3 extends Enemies
{
    GreenfootImage image1 = new GreenfootImage("pirate3_img1.png");
    GifImage gif = new GifImage("pirate3_gif.gif");
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy3(){
    
    }
    public void act()
    {
        setImage(gif.getCurrentImage());
        move(getSpeed());
        isShot();
        isFighting();
        isDead();
        isTouchingBorder();
    }
    protected void isTouchingBorder(){
        if(healthPoints > 0 && getX() == edgeOfWorld){
            World shipInterior = new ShipInterior();
            Greenfoot.setWorld(shipInterior);
            CrossedEnemy3 crossedEnemy = new CrossedEnemy3();
            shipInterior.addObject(crossedEnemy, 693, 515);
        }
    }
}
