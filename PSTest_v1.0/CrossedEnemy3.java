import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CrossedEnemy3 extends Enemies
{
    GreenfootImage image1 = new GreenfootImage("pirate3_img1.png");
    GifImage gif = new GifImage("pirate3_gif.gif");
    /**
     * Act - do whatever the CrossedEnemy3 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CrossedEnemy3(){
        for (GreenfootImage image : gif.getImages())
    {
        int wide = (image.getWidth()*3)/2;
        int high = (image.getHeight()*3)/2;
        image.scale(wide, high);
    }
    }
    public void act()
    {
        setImage(gif.getCurrentImage());
        isFighting();
        move(getSpeed());
        cutScene();
    }
    protected void cutScene(){
        if(getY() > 326){
            setLocation(getX(), getY() - 1);
        }else{
            GreenfootImage straight = new GreenfootImage("Enemy3Straight.png");
            int wide = (straight.getWidth()*3)/2;
            int high = (straight.getHeight()*3)/2;
            straight.scale(wide, high);
            setImage(straight);
            YouLostMessage lostMessage = new YouLostMessage();
            getWorld().addObject(lostMessage, 360, 360);
            showText(Integer.toString(Enemies.enemiesKilled), 600, 520);
            showText(Integer.toString(SmallGoldBar.goldAccumulated) + "g", 585, 615);
            Background.stopAmbiance();
            MainMenuButton mainMenu = new MainMenuButton();
            getWorld().addObject(mainMenu, 575, 325);
        }
    }
}
