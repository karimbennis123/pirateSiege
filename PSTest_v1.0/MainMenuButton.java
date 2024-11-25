import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MainMenuButton extends Actor
{

    /**
     * Act - do whatever the MainMenuButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            World menuScreen = new MenuScreen();
            Greenfoot.setWorld(menuScreen);
        }
    }
}
