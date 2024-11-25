import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class ShipInterior extends World
{
    public static GreenfootImage shipInteriorImage = new GreenfootImage("ShipInterior.jpg");
    GreenfootSound lostSound = new GreenfootSound("Lost.wav");
    int timer = 200;
    /**
     * Constructor for objects of class ShipInterior.
     */
    public ShipInterior()
    {
        super(720, 720, 1);
        setBackground(shipInteriorImage);
        prepare();
        
    }
    public void act(){
        timer--;
        if(timer == 0){
            lostSound.play();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Treasure treasure = new Treasure();
        addObject(treasure,151,359);
    }
}
