import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Background extends World
{
    private Counter counter;
    int timer = 6000;
    GreenfootSound ambiance = new GreenfootSound("Ambiance.wav");
    /**
     * Constructor for objects of class Background.
     */
    public Background()
    {
        super(848, 600, 1);
        prepare();
    }
    public void act(){
        ambiance.playLoop();
        
        timer--;
        
        switch(timer){
            
            case 5900:
               spawnEnemies();
               break;
            
            case 5700:
                spawnEnemies();
                break;
            
            case 5500:
               spawnEnemies();
               break;
            
            case 5200:
                spawnEnemies();
                break;
            
            case 4800:
               spawnEnemies();
               break;
            
            case 4300:
                spawnEnemies();
                break;
            
            case 4000:
               spawnEnemies();
               break;
            
            case 3800:
                spawnEnemies();
                break;
            
            case 3700:
               spawnEnemies();
               break;
            
            case 3600:
                spawnEnemies();
                break;
                
            case 3200:
               spawnEnemies();
               break;
            
            case 3150:
                spawnEnemies();
                break;
                
            case 3100:
               spawnEnemies();
               break;
            
            case 3050:
                spawnEnemies();
                break;
                
            case 3000:
                spawnEnemies();
                break;
                
            case 2900:
               spawnEnemies();
               break;
            
            case 2800:
                spawnEnemies();
                break;
            
            case 2650:
               spawnEnemies();
               break;
            
            case 2400:
                spawnEnemies();
                break;
            
            case 2200:
               spawnEnemies();
               break;
            
            case 1900:
                spawnEnemies();
                break;
            
            case 1750:
               spawnEnemies();
               break;
            
            case 1500:
                spawnEnemies();
                break;
            
            case 1250:
               spawnEnemies();
               break;
            
            case 1200:
                spawnEnemies();
                break;
                
            case 1000:
               spawnEnemies();
               break;
            
            case 850:
                spawnEnemies();
                break;
                
            case 600:
               spawnEnemies();
               break;
            
            case 300:
                spawnEnemies();
                break;
                
            case 150:
                spawnEnemies();
                break;
            
            case 0:
                
                
            
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        GoldBar goldBar = new GoldBar();
        addObject(goldBar,60,36);
        //Counter counter = new Counter();
        //addObject(counter,155,53);

        //add the counter to the world
        counter = new Counter("Gold: ");
        addObject(counter, 155, 53);

        RecruitSkellyButton button1 =  new  RecruitSkellyButton(counter);
        addObject(button1, 414, 530);
    
        
    }
    public Counter getCounter() {
        return counter;
    }
    public Enemies getEnemies(){
        int randomSpawn = Greenfoot.getRandomNumber(3);
        
        if(randomSpawn == 0){
            Enemy1 enemy1 = new Enemy1();
            return enemy1;
        }
        if(randomSpawn == 1){
            Enemy2 enemy2 = new Enemy2();
            return enemy2;
        }
        else{
            Enemy3 enemy3 = new Enemy3();
            return enemy3;
        }
    }
    public int getRandomY(){
        int randomY = Greenfoot.getRandomNumber(2);
        
        if(randomY == 0){
            return 185;
        }
        else{
            return 337;
        }
    }
    public void spawnEnemies(){
        addObject(getEnemies(), 848, getRandomY());
    }
}
