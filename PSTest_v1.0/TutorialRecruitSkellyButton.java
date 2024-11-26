import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialRecruitSkellyButton extends Buttons
{
    GreenfootImage button = new GreenfootImage("RecruitSkellyButton1.png");
    GreenfootImage buttonHighlighted = new GreenfootImage("RecruitSkellyButton1Highlighted.png");
    GreenfootImage buttonGrayed = new GreenfootImage("RecruitSkellyButton1BlackandWhite.png");
    private Counter counter;
    public TutorialRecruitSkellyButton(Counter counter){
        this.counter = counter;
        button.scale(150,100);
        buttonHighlighted.scale(150,100);
        buttonGrayed.scale(150,100);
        setImage(button);
    }
    /**
     * Act - do whatever the TutorialRecruitSkellyButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Background2 world = (Background2) getWorld();
        Counter counter = world.getCounter();
        int recruitValue = 10;
        if (counter.getValue() <  recruitValue) { //check if the counter has enough gold
            setImage(buttonGrayed);
        } else if (counter.getValue() >= recruitValue) {
            TutorialRecruitSkelly skelly1 =  new  TutorialRecruitSkelly();
            if (Greenfoot.mouseMoved(getWorld())) {
                setImage(button);
            }
            if (Greenfoot.mouseMoved(this)) {
                setImage(buttonHighlighted);
            }
            if (Greenfoot.mouseClicked(this)) {
                TutorialArrow arrow1 =  new  TutorialArrow();
                getWorld().addObject(arrow1, 163, 277);
                
                TutorialArrow arrow2 =  new  TutorialArrow();
                getWorld().addObject(arrow2, 163, 125);
                
                TutorialArrow arrow3 =  new  TutorialArrow();
                getWorld().addObject(arrow3, 388, 277);
                
                TutorialArrow arrow4 =  new  TutorialArrow();
                getWorld().addObject(arrow4, 388, 125);
                
                TutorialArrow arrow5 =  new  TutorialArrow();
                getWorld().addObject(arrow5, 613, 277);
                
                TutorialArrow arrow6 =  new  TutorialArrow();
                getWorld().addObject(arrow6, 613, 125);
                
                
                counter.add(-recruitValue);
                
            }
            
        }
    }
}
