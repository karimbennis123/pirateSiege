// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bullets extends Actor
{
    protected int speed;

    /**
     * Act - do whatever the Bullets wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }

    /**
     * 
     */
    public void borderCollision(Bullets bullet)
    {
        if (bullet.isAtEdge()) {
            getWorld().removeObject(this);
        }
    }

    /**
     * 
     */
    public void setSpeed(int tempSpeed)
    {
        speed = tempSpeed;
        move(speed);
    }
}
