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
    Shape[] startShapes = {circle1,square1,triangle1,star1,rectangle1,diamond1};
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
        if (s != null){
            s.setLocation(width/2, (height/2)+40);
            s.setSize("Large");
            for(Shape check : startShapes){
                if (check != s){
                    removeObject(check);
                }
            }
        }
    }
    private void rotate(){
        
    }
    private Shape chosenShape(){
        Shape temp = null;    
            for (Shape s : startShapes){
                if (s.pressed()){
                    temp = s;
                }
            }
        return temp;
    }
    
    public void act(){
        spotlight(chosenShape());
    }
}
