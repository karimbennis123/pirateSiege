import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemies extends Actor
{
    private GifImage gif = new GifImage("Enemy1.gif");
    
    public Enemies(){
        for (GreenfootImage image : gif.getImages())
    {
        int wide = image.getWidth()*2;
        int high = image.getHeight()*2;
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
