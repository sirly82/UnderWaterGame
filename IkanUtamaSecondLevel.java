import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IkanUtamaSecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IkanUtamaSecondLevel extends Actor
{
    /**
     * Act - do whatever the IkanUtamaSecondLevel wants to do. This method is called whenever
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
            setLocation(getX(), getY()-12);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+12);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-8, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+8, getY());
        }
    }
    
    private void checkCollision()
    {
       Ikan1 ikan1 = (Ikan1)getOneIntersectingObject(Ikan1.class);
       if(ikan1 != null)
       {
           getWorld().removeObject(ikan1);
           SecondLevel.score.add(3);
       }
       
       Ikan2 ikan2 = (Ikan2)getOneIntersectingObject(Ikan2.class);
       if(ikan2 != null)
       {
           getWorld().removeObject(ikan2);
           SecondLevel.score.add(2);
       }
       
       HiuSecondLevel hiuSecondLevel = (HiuSecondLevel)getOneIntersectingObject(HiuSecondLevel.class);
       if(hiuSecondLevel != null)
       {
           getWorld().removeObject(hiuSecondLevel);
           SecondLevel.score.add(5);
       }
       
       Udang udang = (Udang)getOneIntersectingObject(Udang.class);
       if(udang != null)
       {
           getWorld().removeObject(udang);
           SecondLevel.hp.add(-1);
       }
       
       Gurita gurita = (Gurita)getOneIntersectingObject(Gurita.class);
       if(gurita != null)
       {
           getWorld().removeObject(gurita);
           SecondLevel.hp.add(-2);
       }
    }
}
