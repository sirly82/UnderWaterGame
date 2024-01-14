import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowPlayLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowPlayLevel2 extends World
{

    /**
     * Constructor for objects of class HowPlayLevel2.
     * 
     */
    public HowPlayLevel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cancel cancel = new Cancel();
        addObject(cancel,881,70);
        Before before = new Before();
        addObject(before,199,449);
    }
}
