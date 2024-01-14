import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HiuSecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiuSecondLevel extends Actor
{
    private int speed;
    /**
     * Act - do whatever the HiuSecondLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HiuSecondLevel()
    {
        speed = Greenfoot.getRandomNumber(4)+1;
    }
    
    public void act()
    {
        setLocation(getX()-speed, getY());
        if(getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
