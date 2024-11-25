import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialEnemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialEnemy2 extends Enemies
{
    GreenfootImage image1 = new GreenfootImage("pirate2_img1.png");
    GifImage gif = new GifImage("pirate2_gif.gif");
    public TutorialEnemy2() {
        
    }
    /**
     * Act - do whatever the TutorialEnemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getWorld() == null) {
            return; // Avoid calling methods on a removed object
        }
        setImage(gif.getCurrentImage());
        move(getSpeed());
        isShot();
        isFighting();
        isDead();
        if (getWorld() != null) {
            isTouchingBorder();
            isTouchingTreasure();
        }
    }
    public void isFighting(){
        if(isTouching(TutorialAmouredSkelly.class)){
            swordDuel.play();
            long currentTime = System.currentTimeMillis();
            speed = -1;
            if(currentTime - lastActionTime >= 1200){
                healthPoints -= armouredDamage;
                lastActionTime = currentTime;
            }
        }
        else if(isTouching(TutorialRecruitSkelly.class)){
            swordDuel.play();
            long currentTime = System.currentTimeMillis();
            speed = -1;
            if(currentTime - lastActionTime >= 1000){
                healthPoints -= recruitDamage;
                lastActionTime = currentTime;
            }
        }
        else if(isTouching(TutorialRangedSkelly.class)){
            speed = -1;
        }
        else{
            speed = -2;
            swordDuel.stop();
        }
    }
    public void isDead(){
        if(healthPoints <= 0){
         TutorialSmallGoldBag gold = new TutorialSmallGoldBag();
         getWorld().addObject(gold, getX() + 100, getY());
         System.out.println("Removing enemy: " + this);
         if (getWorld() != null) { // Ensure the enemy is still in the world
            getWorld().removeObject(this);
            }
         
        }
    }
}
