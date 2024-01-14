import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IkanUtama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IkanUtama extends Actor
{
    /**
     * Act - do whatever the IkanUtama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        checkCollision();
    }
    
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-8);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+8);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
        }
    }
    
    private void checkCollision()
    {
       Ikan1 ikan1 = (Ikan1)getOneIntersectingObject(Ikan1.class);
       if(ikan1 != null)
       {
           getWorld().removeObject(ikan1);
           MyWorld.score.add(3);
       }
       
       Ikan2 ikan2 = (Ikan2)getOneIntersectingObject(Ikan2.class);
       if(ikan2 != null)
       {
           getWorld().removeObject(ikan2);
           MyWorld.score.add(2);
       }
       
       Udang udang = (Udang)getOneIntersectingObject(Udang.class);
       if(udang != null)
       {
           getWorld().removeObject(udang);
           MyWorld.hp.add(-1);
       }
    }
}
