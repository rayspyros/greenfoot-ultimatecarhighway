import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    private void prepare()
    {
        ambulance ambulance = new ambulance();
        addObject(ambulance,302,548);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new carblue(), Greenfoot.getRandomNumber(150) + 200, 0);
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new carred(), Greenfoot.getRandomNumber(150) + 200, 600);
        }
        if(Greenfoot.getRandomNumber(10)<2){
            addObject(new tree(), Greenfoot.getRandomNumber(80), 0);
            addObject(new tree(), Greenfoot.getRandomNumber(80) + 530, 0);
        }
        if(Greenfoot.getRandomNumber(300)<1){
            addObject(new coin(), Greenfoot.getRandomNumber(150) + 200, 0);
        }
    }
    
 
}
