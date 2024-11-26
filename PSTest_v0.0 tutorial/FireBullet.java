// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class FireBullet extends Bullets
{

    /**
     * 
     */
    public FireBullet()
    {
        GreenfootImage img = getImage();
        img.scale(50, 50);
    }

    /**
     * Act - do whatever the FireBullet wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setSpeed(20);
        borderCollision(this);
    }
}
