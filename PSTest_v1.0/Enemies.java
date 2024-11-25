import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemies extends Actor
{
    GreenfootImage shipInteriorImage = new GreenfootImage("ShipInterior.jpg");
    static int enemiesKilled = 0;
    protected int bulletDamage = Greenfoot.getRandomNumber(16)+25;
    protected int armouredDamage = Greenfoot.getRandomNumber(11) + 40;
    protected int recruitDamage = Greenfoot.getRandomNumber(11) + 30;
    protected int healthPoints = 100;
    protected int speed;
    protected int edgeOfWorld = 0;
    protected World shipInterior = new ShipInterior();
    private long lastActionTime = 0;
    private GifImage gif = new GifImage("SmokeScreen.gif");
    GreenfootSound swordDuel = new GreenfootSound("SwordDuel.wav");
    private int timer = 200;
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
        else if(isTouching(Treasure.class)){
            speed = 0;
            setLocation(getX(), getY());
        }else{
            speed = -2;
            swordDuel.stop();
        }
    }
    protected void isDead(){
        if(healthPoints <= 0){
         SmallGoldBar gold = new SmallGoldBar();
         getWorld().addObject(gold, getX() + 100, getY());
         enemiesKilled++;
        getWorld().removeObject(this);
        }
    }
    
    protected void cutScene(){
        if(getY() > 326){
            setLocation(getX(), getY() - 1);
        }else{
            GreenfootImage straight = new GreenfootImage("Enemy1Straight.png");
            straight.scale(96, 124);
            setImage(straight);
            YouLostMessage lostMessage = new YouLostMessage();
            getWorld().addObject(lostMessage, 360, 360);
            showText(Integer.toString(Enemies.enemiesKilled), 600, 520);
            showText(Integer.toString(Counter.getValue()), 600, 615);
            Background.stopAmbiance();
            MainMenuButton mainMenu = new MainMenuButton();
            getWorld().addObject(mainMenu, 575, 325);
        }
    }
    public void showText(String message, int x, int y)
    {
        GreenfootImage bg = getWorld().getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }

}
