import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Background2 extends World
{
    private Counter counter;
    //GreenfootSound ambiance = new GreenfootSound("Ambiance.wav");    
    /**
     * Constructor for objects of class Background.
     */
    public Background2()
    {
        super(848, 600, 1);
        prepare();
        TutorialManager tutorial = new TutorialManager();
        addObject(tutorial, 424, 50);
        setPaintOrder(GoldBar.class, Counter.class, TutorialArrow.class);
    }
    public void act() {
        
        
        
        
    } 
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       
        counter = new Counter("Gold: ");
        addObject(counter, 275, 540);

        TutorialRecruitSkellyButton button1 =  new  TutorialRecruitSkellyButton(counter);
        addObject(button1, 414, 530);
        
        TutorialWood tutorialBackground = new TutorialWood();
        addObject(tutorialBackground, 424, 51);
        
        GreenfootImage wood = new GreenfootImage("WoodenBackgroundTutorial.png");
        

      
        
        
    }
    
    public Counter getCounter() {
        return counter;
    }
}
    