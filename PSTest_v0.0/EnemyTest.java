import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyTest extends Enemies
{
    private GifImage gif = new GifImage("Enemy1.gif");
    
    public EnemyTest(){
        for (GreenfootImage image : gif.getImages())
    {
        int wide = image.getWidth()*3;
        int high = image.getHeight()*3;
        image.scale(wide, high);
    }
    }
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(gif.getCurrentImage());
        move(-1);
    }
}
