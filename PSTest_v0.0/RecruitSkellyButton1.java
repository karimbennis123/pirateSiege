import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RecruitSkellyButton1 extends Buttons
{
    GreenfootImage button = new GreenfootImage("RecruitSkellyButton1.png");
    GreenfootImage buttonHighlighted = new GreenfootImage("RecruitSkellyButton1Highlighted.png");
    GreenfootImage buttonGrayed = new GreenfootImage("RecruitSkellyButton1BlackandWhite.png");
    private Counter counter;
    public RecruitSkellyButton1(Counter counter){
        this.counter = counter;
        button.scale(300,300);
        buttonHighlighted.scale(300,300);
        buttonGrayed.scale(300,300);
        setImage(button);
    }
    /**
     * Act - do whatever the Option1_Button wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment. PLACEHOLDER FOR RECRUIT SKELLY BUTTON
     */
    public void act()
    {
        Background world = (Background) getWorld();
        Counter counter = world.getCounter();
        if (counter.getValue() <  5) { //check if the counter has enough gold
            setImage(buttonGrayed);
        } else if (counter.getValue() >= 5) {
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
                
                counter.add(-5);
                
            
                getWorld().removeObject(arrow1);
                getWorld().removeObject(arrow2);
                
            }
        }
        
    }
}
