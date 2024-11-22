import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RecruitSkellyButton extends Buttons
{
    GreenfootImage button = new GreenfootImage("RecruitSkellyButton1.png");
    GreenfootImage buttonHighlighted = new GreenfootImage("RecruitSkellyButton1Highlighted.png");
    GreenfootImage buttonGrayed = new GreenfootImage("RecruitSkellyButton1BlackandWhite.png");
    private Counter counter;
    public RecruitSkellyButton(Counter counter){
        this.counter = counter;
        button.scale(150,100);
        buttonHighlighted.scale(150,100);
        buttonGrayed.scale(150,100);
        setImage(button);
    }
    /**
     * Act - do whatever the Option1_Button wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment. PLACEHOLDER FOR RECRUIT SKELLY BUTTON
     */
    public void act()
    {
        Background world = (Background) getWorld();
        Counter counter = world.getCounter();
        int recruitValue = 10;
        if (counter.getValue() <  recruitValue) { //check if the counter has enough gold
            setImage(buttonGrayed);
        } else if (counter.getValue() >= recruitValue) {
            RecruitSkelly skelly1 =  new  RecruitSkelly();
            if (Greenfoot.mouseMoved(getWorld())) {
                setImage(button);
            }
            if (Greenfoot.mouseMoved(this)) {
                setImage(buttonHighlighted);
            }
            if (Greenfoot.mouseClicked(this)) {
                Arrow arrow1 =  new  Arrow();
                getWorld().addObject(arrow1, 163, 277);
                Arrow arrow2 =  new  Arrow();
                getWorld().addObject(arrow2, 163, 125);
                Arrow arrow3 =  new  Arrow();
                getWorld().addObject(arrow3, 388, 277);
                Arrow arrow4 =  new  Arrow();
                getWorld().addObject(arrow4, 388, 125);
                Arrow arrow5 =  new  Arrow();
                getWorld().addObject(arrow5, 613, 277);
                Arrow arrow6 =  new  Arrow();
                getWorld().addObject(arrow6, 613, 125);
                
                
                counter.add(-recruitValue);
                
            }
            
        }
        
    }
}
