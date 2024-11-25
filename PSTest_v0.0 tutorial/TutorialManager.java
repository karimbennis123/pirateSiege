import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class TutorialManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialManager extends Actor
{
    private int step = 0;  // Track which step of the tutorial we're on
    private boolean waitingForAction = false;
    private boolean initialized = false;
    public TutorialManager() {
        
        
    }
    /**
     * Act - do whatever the TutorialManager wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (!initialized) {
        displayMessage("\n" + "Welcome To The Tutorial!" + "\n" + " Click The Recruit Skelly Button!" + "\n" + " Note: Each Recruit Skelly Costs 10g and You Start With 20g!");
        initialized = true; // Ensure it only runs once
        }
        
        Background2 world = (Background2) getWorld();
        Counter counter = world.getCounter();
        List<Enemies> enemies = getWorld().getObjects(Enemies.class);
        List<TutorialArrow> arrows = getWorld().getObjects(TutorialArrow.class);
        List<Upgrades> upgrades = getWorld().getObjects(Upgrades.class);
        //List<TutorialAmouredUpgrade> armouredUpgrades = getWorld().getObjects(TutorialAmouredUpgrade.class);
        //List<TutorialRangedUpgrade> rangedUpgrades = getWorld().getObjects(TutorialRangedUpgrade.class);
        switch (step) {
            case 0: // RecruitSkelly tutorial
                if (Greenfoot.mouseClicked(getWorld().getObjects(TutorialRecruitSkellyButton.class).get(0))) {
                    displayMessage("Good job!" + "\n" + " Now, click any Red arrow to place him.");
                    System.out.println("Arrows in the world: " + getWorld().getObjects(TutorialArrow.class).size());
                    step++;
                }
                break;
            case 1: // RecruitSkelly tutorial
                for (TutorialArrow arrow : arrows) {
                    if (Greenfoot.mouseClicked(arrow)) {
                        System.out.println("Arrow clicked!");
                        displayMessage("Great!" + "\n" + " Place Another Recruit Skelly in the 2nd row");
                        System.out.println("Current counter value: " + counter.getValue());
                        step++;
                    }
                }
                break;
            case 2: //Fighting tutorial
                if (counter.getValue() <= 0) {
                    spawnEnemies();
                    displayMessage("Here Comes an Enemy!");
                    step++;
                }
                break;
            case 3: //Pick up gold tutorial
                if (enemies.isEmpty()) {
                    displayMessage("Nice Job!" + "\n" + "Enemies Drop Some Gold. Pick It Up.");
                    step++;
                }
                break;
            case 4: //Figting tutorial
                if (counter.getValue() <= 15) {
                    spawnEnemies();
                    spawnEnemies();
                    spawnEnemies();
                    step++;
                }
                break;
                
            case 5: // Upgrading tutorial
                if (counter.getValue() >= 15) {
                    displayMessage("\n" + "Upgrade Recruit Skelly By Clicking On Him." + "\n" + "Choose An Armoured Skelly Or A Ranged Skelly." + "\n" + "An Upgrade Costs 15g!");
                    step++;
                }
                break;
            case 6: //More Fighting
                for (Upgrades upgrade : upgrades) {
                    if (Greenfoot.mouseClicked(upgrade)) {
                        System.out.println("upgrade clicked!");
                        displayMessage("Good Job!");
                        spawnEnemies();
                        spawnEnemies();
                        step++;
                        return;
                    }
                }
                break;
            case 7:
                if (enemies.isEmpty()) {
                    System.out.println("NO more enemies!");
                    displayMessage("Tutorial Complete! Good luck!");
                    step++;
                }
                break;
            case 8: // End the tutorial
                if (!waitingForAction) {
                    waitingForAction = true;
                    Greenfoot.delay(300); // Pause for 100 frames
                    
                    MenuScreen menuScreen = new MenuScreen();
                    Greenfoot.setWorld(menuScreen);
                }
                break;
           
        }
    }
    private void displayMessage(String message) {
        World world = getWorld();
        if (world != null) {
        world.showText(message, getWorld().getWidth() / 2, 30);
        }  else {
        System.out.println("World is null; unable to display message: " + message);
        }

    }
    public Enemies getEnemies(){
        int randomSpawn = Greenfoot.getRandomNumber(3);
        
        if(randomSpawn == 0){
            TutorialEnemy1 enemy1 = new TutorialEnemy1();
            return enemy1;
        }
        if(randomSpawn == 1){
            TutorialEnemy2 enemy2 = new TutorialEnemy2();
            return enemy2;
        }
        else{
            TutorialEnemy1 enemy1 = new TutorialEnemy1();
            return enemy1;
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
        World world = getWorld();
        world.addObject(getEnemies(), 848, getRandomY());
    }
    
}
