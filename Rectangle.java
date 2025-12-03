import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    public Rectangle(){
        super("White-Rectangle.png");
    }
    public Rectangle(int x, int y){
        super(x,y,"White-Rectangle.png");
    }
    public Rectangle(int x, int y, String img){
        super(x,y,img);
    }
    
    /**
     * Act - do whatever the Rectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setSize(Size.LARGE);
    }
}
