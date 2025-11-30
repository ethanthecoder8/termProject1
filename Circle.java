import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    private int x;
    private int y;
    private World world = getWorld();
    public Circle(){
        x = world.getWidth()/2;
        y = world.getHeight()/2;
        setImage("White-Circle.png");
    }
    public Circle(int x, int y){
        this.x = x;
        this.y = y;
        setImage("White-Circle.png");
    }
    public Circle(int x, int y, String img){
        this.x = x;
        this.y = y;
        setImage(img);
    }
    /**
     * Act - do whatever the Circle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
