import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMode extends Actor
{
    private double stat;
    public int score;
    public int timesPlayed;
    private boolean found;
    private boolean playing;
    private int correct;
    private String level;
    private int rand;
    Circle circle1 = new Circle();
    Square square1 = new Square();
    Triangle triangle1 = new Triangle();
    Star star1 = new Star();
    Rectangle rectangle1 = new Rectangle();
    Diamond diamond1 = new Diamond();
    Shape[] easyShapes = {circle1, square1};
    Shape[] mediumShapes = {circle1,square1,rectangle1,triangle1};
    Shape[] hardShapes = {circle1,square1,rectangle1,triangle1,star1,diamond1};
    World world;
    Text find = new Text("",75,Color.BLUE);
    
    private int x1 = 175;
    private int y1 = 250;
    private int x2 = 425;
    private int y2 = 250;
    
    public GameMode(String l){
        level = l;
        stat = 0;
        world = getWorld();
        timesPlayed = 0;
        correct = 0;
        found = false;
        playing = false;
    }
    
    public void easy(World world){
        findShape(world);

        
    }
    public void findShape(World world){
        rand = Greenfoot.getRandomNumber(2);
        int rand2 = Greenfoot.getRandomNumber(2);
        int x1=175;
        int y1=250;
        int x2=425;
        int y2=250;
        world.addObject(find,300,100);
        if (rand2 == 0 ){
            find.setMessage("Find the Circle");
            circle1.playSound();
            if (circle1.pressed()){
                correct++;
                Greenfoot.playSound("GoodJob.wav");
            } else if (square1.pressed()){
                Greenfoot.playSound("NiceTry.wav");
            }
        } else{
            find.setMessage("Find the Square");
            square1.playSound();
            if (square1.pressed()){
                correct++;
                Greenfoot.playSound("WellDone.wav");
            } else if (square1.pressed()){
                Greenfoot.playSound("TryAgain.wav");
            }
        }
        if(rand == 0){
            world.addObject(square1, x1,y1);
            world.addObject(circle1, x2,y2);
        }else{
            world.addObject(circle1, x1,y1);
            world.addObject(square1, x2,y2);
        }
    }
    public void medium(World world){
        rand = Greenfoot.getRandomNumber(4);
    }
    public void hard(World world){
        rand = Greenfoot.getRandomNumber(6);
    } 
    public void setPosition(){
        
    }
    public void colorLevel(){
        
    }
    public void stat(){
        
    }
    public void shapeVisible(boolean v, World world){
        if (!v){
            this.world = world;
            world.removeObject(circle1);
            world.removeObject(square1);
            world.removeObject(rectangle1);
            world.removeObject(triangle1);
            world.removeObject(star1);
            world.removeObject(diamond1);
            find.setMessage("");
        }
    }
    
    
    /**
     * Act - do whatever the GameMode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
