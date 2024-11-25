import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NotEnoughGold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NotEnoughGold extends Actor
{
    /**
     * Act - do whatever the NotEnoughGold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        frameCount++;
        if (frameCount >= lifespan) {
            // Remove the text from the world after the lifespan
            getWorld().removeObject(this);
        }
    }
    private int lifespan; // The number of frames the text will be displayed
    private int frameCount; // Tracks how many frames have passed
    public NotEnoughGold(String text, int duration) {
        this.lifespan = duration;
        this.frameCount = 0;
        
        GreenfootImage image = new GreenfootImage(200, 50); // Create an image
        image.setColor(Color.WHITE);                       // Set text color
        image.setFont(new Font("Arial", true, false, 18)); // Set font
        image.drawString(text, 10, 25);                   // Draw text
        setImage(image); // Set the image of the actor
        
    }
}
