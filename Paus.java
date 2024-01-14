import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paus extends Actor
{
    public int score;
    /**
     * Act - do whatever the Paus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-3, getY());
        if(isTouching(IkanUtamaSecondLevel.class))
        {
            removeTouching(IkanUtamaSecondLevel.class);
            Greenfoot.setWorld(new OverPageSecondLevel());
        }
        
        if(getX() < 5)
            getWorld().removeObject(this);
    }
}
