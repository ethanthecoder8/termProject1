import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int x;
    private int y;
    private int height;
    private int width;
    private String img;
    private GreenfootImage image;
    private GreenfootImage hoverImage;
    private boolean hovering = false;
    private MouseInfo m = Greenfoot.getMouseInfo();
    
    /**
     * Empty Button constructor
     * 
     *
     */
    public Button(){
        
    }
    /**
     * Creates a Button object
     * 
     * @param x the desired x position of the object 
     * @param y the desired y position of the object
     * @param img the desired image for the object 
     */
    public Button(int x, int y, String img){
        this.x = x; 
        this.y = y;
        this.img = img;
        image = getImage();
        hoverImage = image;
        hoverImage.scale(image.getWidth()+5,image.getHeight()+5);
        setImage(img);
        width = image.getWidth();
        height = image.getHeight();
    }
    /**
     * Creates a Button object
     * 
     * @param x the desired x position of the object
     * @param y the desired y position of the object
     * @param img the desired image for the object 
     * @param h the desired height of the object 
     * @param w the desired width of the object 
     */
    public Button(int x, int y, String img, int w, int h){
        this.x = x; 
        this.y = y;
        this.img = img;
        height = h;
        width = w;
        setImage(img);
        image = getImage();
        hoverImage = image;
        hoverImage.scale(image.getWidth()+5,image.getHeight()+5);
        image.scale(w,h);
        setImage(image);
    }
    
    /**
     * If the Button is pressed, this removes it from the world
     * 
     * @param w the world to remove the button from 
     */
    public void removePressed(World w){
        if(Greenfoot.mousePressed(this)){
            w.removeObject(this);
        }
    }
    /**
     * Determines whether Button is pressed
     * 
     * @return boolean returns true if the button is pressed
     */
    public boolean pressed(){
        boolean result = false;
        if(Greenfoot.mousePressed(this)){
            result = true;
        }
        return result;
    }
    /**
     * This removes the button from the world
     * 
     * @param w the world to remove the button from 
     */
    public void remove(World w){
        w.removeObject(this);
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    /**
    private boolean mouseHovering(){
        boolean temp = false;
        m = Greenfoot.getMouseInfo();
        if (m == null){
            hovering = false;
            temp = false;
        } else {
            temp = m.getActor() == this;
        }
         
        return temp;
    }
    public void hover(){
        setImage(img);
        //boolean temp = mouseHovering();
        image = getImage();
        if(mouseHovering()){
            setImage(hoverImage);
        } else {
            setImage(image);
        }
        setImage(image);
    }
    
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //hover();
    }
}
