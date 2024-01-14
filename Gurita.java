import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gurita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gurita extends Actor
{
    private int speed;
    /**
     * Act - do whatever the Gurita wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gurita()
    {
        speed = Greenfoot.getRandomNumber(4)+1;
    }
    
    public void act()
    {
        setLocation(getX(), getY()+speed);
        if(getY() >= 500)
        {
            getWorld().removeObject(this);
        }
    }
}
