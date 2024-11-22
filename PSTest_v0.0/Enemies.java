import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemies extends Actor
{
    protected int bulletDamage = Greenfoot.getRandomNumber(16)+25;
    protected int armouredDamage = Greenfoot.getRandomNumber(11) + 40;
    protected int recruitDamage = Greenfoot.getRandomNumber(11) + 30;
    protected int healthPoints = 100;
    protected int speed;
    private long lastActionTime = 0;
    private GifImage gif = new GifImage("SmokeScreen.gif");
    GreenfootSound swordDuel = new GreenfootSound("SwordDuel.wav");
    
    public Enemies(){
    }
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    protected int getSpeed (){
        return speed;
    }
    protected void isShot(){
        if(isTouching(Bullets.class)){
            healthPoints -= bulletDamage;
            List<Bullets> bullets = getIntersectingObjects(Bullets.class);
            getWorld().removeObjects(bullets);
        }
    }
    protected void isFighting(){
        if(isTouching(ArmouredSkelly.class)){
            swordDuel.play();
            long currentTime = System.currentTimeMillis();
            speed = -1;
            if(currentTime - lastActionTime >= 1200){
                healthPoints -= armouredDamage;
                lastActionTime = currentTime;
            }
        }
        else if(isTouching(RecruitSkelly.class)){
            swordDuel.play();
            long currentTime = System.currentTimeMillis();
            speed = -1;
            if(currentTime - lastActionTime >= 1000){
                healthPoints -= recruitDamage;
                lastActionTime = currentTime;
            }
        }
        else if(isTouching(RangedSkelly.class)){
            speed = -1;
        }
        else{
            speed = -2;
            swordDuel.stop();
        }
    }
    protected void isDead(){
        if(healthPoints <= 0){
         SmallGoldBar gold = new SmallGoldBar();
         getWorld().addObject(gold, getX() + 100, getY());
            getWorld().removeObject(this);
         
        }
    }
    protected void isTouchingBorder(){
        
    }
}
