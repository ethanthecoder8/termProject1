import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Learning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Learning extends World
{
    private int width = getWidth();
    private int height = getHeight();
    Circle circle1 = new Circle();
    Square square1 = new Square();
    Triangle triangle1 = new Triangle();
    Star star1 = new Star();
    Rectangle rectangle1 = new Rectangle();
    Diamond diamond1 = new Diamond();
    
    private int shapeRotation;
    
    /**
     * Constructor for objects of class Learning.
     * 
     */
    public Learning()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        shapeRotation = 1;
        addObject(circle1, width/6, height/4);
        addObject(square1, width/2, height/4);
        addObject(triangle1, width-(width/6), height/4);
        addObject(star1, width/6,height-(height/4));
        addObject(rectangle1, width/2, height-(height/4));
        addObject(diamond1, width-(width/6), height-(height/4));
    }
    
    private void spotlight(Shape s){
        s.setLocation(width/2, height/2);
        s.setSize("Large");
        
    }
    private void rotate(){
        
    }
    private Shape choosenShape(){
        for (circle1.isPressed){
    }
    
    public void act(){
        
    }
}
