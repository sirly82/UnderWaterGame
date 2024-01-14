import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Udang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Udang extends Actor
{
    private int speed;
    /**
     * Act - do whatever the Udang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Udang()
    {
        speed = Greenfoot.getRandomNumber(4)+1;
    }
    
    public void act()
    {
        setLocation(getX()-speed, getY());
        turn(1);
        if(getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
