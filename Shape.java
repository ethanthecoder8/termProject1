import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shapes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shape extends Actor
{
    int x;
    int y;
    private World world = getWorld();
    
    public Shape(){
        
    }
    public Shape(String img){
        x = world.getWidth()/2;
        y = world.getHeight()/2;
        setImage(img);
    }
    public Shape(int x, int y, String img){
        this.x = x;
        this.y = y;
        setImage(img);
    }
    
    /**
     * Act - do whatever the Shapes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
