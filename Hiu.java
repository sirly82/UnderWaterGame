import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hiu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hiu extends Actor
{
    public int score;
    /**
     * Act - do whatever the Hiu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-3, getY());
        if(isTouching(IkanUtama.class))
        {
            removeTouching(IkanUtama.class);
            Greenfoot.setWorld(new OverPage());
        }
        
        if(getX() < 5)
            getWorld().removeObject(this);
    }
}
