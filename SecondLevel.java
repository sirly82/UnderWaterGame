import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevel extends World
{
    static Counter score = new Counter("Score: ");
    static Counter hp = new Counter("Hp: ");
    /**
     * Constructor for objects of class SecondLevel.
     * 
     */
    public SecondLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(200) < 1)
        {
            addObject(new Ikan1(), 958, Greenfoot.getRandomNumber(460));
        }
        
        if(Greenfoot.getRandomNumber(250) < 1)
        {
            addObject(new Ikan2(), 958, Greenfoot.getRandomNumber(460));
        }
        
        if(Greenfoot.getRandomNumber(200) < 1)
        {
            addObject(new Udang(), 958, Greenfoot.getRandomNumber(460));
        }

        if(Greenfoot.getRandomNumber(300) < 1)
        {
            addObject(new HiuSecondLevel(), 958, Greenfoot.getRandomNumber(460));
        }
        
        if(Greenfoot.getRandomNumber(400) < 1)
        {
            addObject(new Paus(), 958, Greenfoot.getRandomNumber(460));
        }
        
        if(Greenfoot.getRandomNumber(450) < 1)
        {
            addObject(new Gurita(), Greenfoot.getRandomNumber(600), 10);
        }
        
        if(SecondLevel.hp.getValue() == 0)
        {
            Greenfoot.setWorld(new OverPageSecondLevel());
        }
        
        if(SecondLevel.score.getValue() == 100)
        {
            Greenfoot.setWorld(new Winner());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        IkanUtamaSecondLevel ikanUtamaSecondLevel = new IkanUtamaSecondLevel();
        addObject(ikanUtamaSecondLevel,127,387);
        Gurita gurita = new Gurita();
        addObject(gurita,446,18);
        removeObject(gurita);
        HiuSecondLevel hiuSecondLevel = new HiuSecondLevel();
        addObject(hiuSecondLevel,933,355);
        removeObject(hiuSecondLevel);
        Ikan1 ikan1 = new Ikan1();
        addObject(ikan1,933,259);
        removeObject(ikan1);
        Ikan2 ikan2 = new Ikan2();
        addObject(ikan2,934,188);
        removeObject(ikan2);
        Paus paus = new Paus();
        addObject(paus,901,76);
        removeObject(paus);
        Udang udang = new Udang();
        addObject(udang,812,427);
        removeObject(udang);
        
        addObject(score, 80, 45);
        score.setValue(0);
        addObject(hp, 80, 80);
        hp.setValue(5);
    }
}
