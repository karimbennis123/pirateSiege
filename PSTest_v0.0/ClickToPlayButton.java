import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class ClickToPlayButton extends Actor
{

    /**
     * Act - do whatever the ClickToPlayButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            World background = new Background();
            Greenfoot.setWorld(background);
        }
    }
}
