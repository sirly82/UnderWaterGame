import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score = new Counter("Score: ");
    static Counter hp = new Counter("Hp: ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        prepare();
    }

    public void act()
    {
        if(Greenfoot.getRandomNumber(150) < 1)
        {
            addObject(new Ikan1(), 958, Greenfoot.getRandomNumber(460));
        }
        
        if(Greenfoot.getRandomNumber(150) < 1)
        {
            addObject(new Ikan2(), 958, Greenfoot.getRandomNumber(460));
        }
        
        if(Greenfoot.getRandomNumber(50) < 1)
        {
            addObject(new Udang(), 958, Greenfoot.getRandomNumber(460));
        }

        if(Greenfoot.getRandomNumber(200) < 1)
        {
            addObject(new Hiu(), 958, Greenfoot.getRandomNumber(460));
        }
        
        if(MyWorld.hp.getValue() == 0)
        {
            Greenfoot.setWorld(new OverPage());
        }

        if(MyWorld.score.getValue() >= 30)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new SecondLevel());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        IkanUtama ikanUtama = new IkanUtama();
        addObject(ikanUtama,180,306);
        Ikan1 ikan1 = new Ikan1();
        addObject(ikan1,782,174);
        removeObject(ikan1);
        Ikan2 ikan2 = new Ikan2();
        addObject(ikan2,667,312);
        removeObject(ikan2);
        Udang udang = new Udang();
        addObject(udang,830,236);
        removeObject(udang);
        Hiu hiu = new Hiu();
        addObject(hiu,869,420);
        removeObject(hiu);

        addObject(score, 80, 45);
        score.setValue(0);
        addObject(hp, 80, 80);
        hp.setValue(3);
    }
}
