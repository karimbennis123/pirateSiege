import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MenuScreen extends World
{
    GreenfootSound menuSound = new GreenfootSound("MenuSound.wav");
    /**
     * Constructor for objects of class MenuScreen.
     */
    public MenuScreen()
    {
        super(848, 600, 1);
        ClickToPlayButton playButton = new ClickToPlayButton();
        addObject(playButton,435,389);
        TutorialButton tutorialButton = new TutorialButton();
        addObject(tutorialButton,433,457);
        menuSound.play();
    }
}
