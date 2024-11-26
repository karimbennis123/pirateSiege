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
    public long lastActionTime = 0;
    private GifImage gif = new GifImage("SmokeScreen.gif");
    GreenfootSound swordDuel = new GreenfootSound("SwordDuel.wav");
    
    public Enemies(){
    }
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getWorld() == null) {
            return; // Prevent further operations if the Actor is removed
        }
        
    }
    protected int getSpeed (){
        return speed;
    }
    protected void isShot(){
        if (getWorld() == null) return; // Avoid further action if removed
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
    public void isDead(){
        if(healthPoints <= 0){
         SmallGoldBar gold = new SmallGoldBar();
         getWorld().addObject(gold, getX() + 100, getY());
            getWorld().removeObject(this);
         
        }
    }
    public boolean isTouchingBorder(){
        if (getWorld() == null) {
            return false; // No border interaction possible if removed
        }
        if (getX() <= 0) {
            LoseScreen loseScreen = new LoseScreen(this);
            if (getWorld() != null) { // Ensure the world is still active
                Greenfoot.setWorld(loseScreen);
            }
            return true; // Border touched, return true to indicate interaction
        }

        return false; // No interaction
        

    }
    public void isTouchingTreasure() {
        if (getWorld() == null) return; // Ensure actor is still in the world
        if (isTouching(Treasure.class)) {
             speed = 0;
        }
    }
}

