import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RangedSkelly extends Crewmen
{
    private int timer = 0;
    private int animationCount=0;
    private int soundCount = 0;
    private GreenfootSound fire1 = new GreenfootSound("Fire01.wav");
    private GreenfootSound fire2 = new GreenfootSound("Fire02.wav");
    private int healthPoints = 75;
    private long lastActionTime = 0; 

    /**
     * 
     */
    public RangedSkelly()
    {
        setImage("RangedSkellyGif1.png");
    }

    /**
     * Act - do whatever the RangedSkelly wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fire();
    }

    /**
     * 
     */
    public void fire()
    {
        timer++;
        animationCount++;
        soundCount++;
        if(timer == 75){
            fire1.play();
        }
        if (timer == 80){
            setImage("RangedSkellyGif2.png");
        }
        if (timer == 90) {
            FireBullet bullet =  new  FireBullet();
            setImage("RangedSkellyGif3.png");
            getWorld().addObject(bullet, getX()+25, getY()-25);
        }
        if (timer == 120){
            setImage("RangedSkellyGif1.png");
            timer = 0;
        }
        isFighting();
        isDead();
    }
    protected void isFighting(){
        if(isTouching(Enemies.class)){
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastActionTime >= 1200){
                healthPoints -= enemyDamage;
                lastActionTime = currentTime;
            }
        }
    }
    protected void isDead(){
        if(healthPoints <= 0){
         getWorld().removeObject(this);
        }
    }
}
