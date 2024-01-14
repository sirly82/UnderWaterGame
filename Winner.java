import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends World
{

    /**
     * Constructor for objects of class Winner.
     * 
     */
    public Winner()
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
        Exit exit = new Exit();
        addObject(exit,576,387);
        Reset reset = new Reset();
        addObject(reset,390,386);
        Cancel cancel = new Cancel();
        addObject(cancel,881,70);
    }
}
