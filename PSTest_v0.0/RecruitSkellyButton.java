import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RecruitSkellyButton extends Buttons
{
    GreenfootImage button = new GreenfootImage("RecruitSkellyButton.png");
    GreenfootImage buttonHighlighted = new GreenfootImage("RecruitSkellyButtonHighlighted.png");
    public RecruitSkellyButton(){
        button.scale(148,106);
        buttonHighlighted.scale(148,106);
    }
    /**
     * Act - do whatever the Option1_Button wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment. PLACEHOLDER FOR RECRUIT SKELLY BUTTON
     */
    public void act()
    {
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
        }
    }
}
