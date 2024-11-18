import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SplashScreen extends World
{
    private int actCounter;
    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super(848, 600, 1);
        
    }
    public void act(){
        countdown();
    }
    public void countdown(){
        actCounter++;
        if(actCounter == 50*3){
            MenuScreen menuScreen = new MenuScreen();
            Greenfoot.setWorld(menuScreen);
            //RecruitSkellyButton button1 =  new  RecruitSkellyButton();
            //addObject(button1, 414, 538);
        }//If 50 act = 1 sec, then stay for 3 seconds then switch to menu.
        
    }
}
