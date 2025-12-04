import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shapes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shape extends Actor

{
    protected int x;
    protected int y;
    protected String img;
    private String color;
    private String name;
    protected World world = getWorld();
    private int width;
    private int height;
    protected Size size = Size.MEDIUM;
    protected static boolean playedSound = false;
    protected GreenfootSound sound;
    
    protected enum Size{
        SMALL, MEDIUM, LARGE
    }
    // Available shapes
    //    CIRCLE, SQUARE, TRIANGLE, STAR, RECTANGLE, DIAMOND
    
    //  Available colors
    //  BLACK, WHITE, PINK, BROWN, PURPLE, RED, ORANGE, YELLOW, BLUE, GREEN
    
    
    
    public Shape(String name, String s){
        //GreenfootImage image = getImage();
        if (world != null){
            x = world.getWidth()/2;
            y = world.getHeight()/2;
        }
        sound = new GreenfootSound(s);
        this.name = name;
        color = "White";
        shapeId();
        GreenfootImage image = getImage();
        width = image.getWidth();
        height = image.getHeight();
    }
    public Shape(String color, String name, String s){
        x = world.getWidth()/2;
        y = world.getHeight()/2;
        sound = new GreenfootSound(s);
        this.name = name;
        this.color = color;
        shapeId();
        GreenfootImage image = getImage();
        width = image.getWidth();
        height = image.getHeight();
    }
    public Shape(int x, int y, String color, String name, String s){
        this.x = x;
        this.y = y;
        sound = new GreenfootSound(s);
        this.name = name;
        this.color = color;
        shapeId();
        
        
        GreenfootImage image = getImage();
        width = image.getWidth();
        height = image.getHeight();
    }
    
    public void playSound(){
        if(!playedSound){
            sound.play();
            playedSound = true;
        }
    }
    private void shapeId(){
        img = color+"-"+name+".png";
        setImage(img);
        
    }
    /**
     * If the shape is pressed, this removes it from the world
     * 
     * @param w the world to remove the shape from 
     */
    public void removePressed(World w){
        if(Greenfoot.mousePressed(this)){
            w.removeObject(this);
        }
    }
    /**
     * Determines whether the shape is pressed
     * 
     * @return boolean returns true if the shape is pressed
     */
    public boolean pressed(){
        boolean result = false;
        if(Greenfoot.mousePressed(this)){
            result = true;
        }
        return result;
    }
    /**
     * This removes the shape from the world
     * 
     * @param w the world to remove the shape from 
     */
    public void remove(World w){
        w.removeObject(this);
    }
    
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public void setColor(String color){
        this.color = color;
        shapeId();
    }
    
    public void setSize(String s){
        GreenfootImage image = new GreenfootImage(img);
        if(s != null && s.equalsIgnoreCase("small")){
            size = Size.SMALL;
            image.scale(width/2,height/2);
        } else if(s != null && s.equalsIgnoreCase("medium")){
            size = Size.MEDIUM;
            image.scale(width,height);
        } else if(s != null && s.equalsIgnoreCase("large")){
            size = Size.LARGE;
            image.scale(width*2-5,height*2-5);
        }
        setImage(image);
    }
    
    
    
    /**
     * Act - do whatever the Shape wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
}
