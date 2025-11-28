import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreenWorld extends World
{
    public enum Stage{
        START, MENU, LEARN, PLAY
    }
    public static Stage stage;
    Button start = new Button(300,200,"Start-Button.png",300, 250);
    Button learn = new Button(150,200,"Learn.png");
    Button play = new Button(450,200, "Play.png");
    /**
     * Constructor for objects of class StartScreenWorld.
     * 
     */
    public StartScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        stage = Stage.START;
        addObject(start, start.getX(),start.getY());
        
    }
    public void changeStage(){
        
        if(start.pressed()){
            start.removePressed(this);
            stage = Stage.MENU; 
        }
        if(learn.pressed()){
            learn.removePressed(this);
            play.remove(this);
            stage = Stage.LEARN;
        }
        if(play.pressed()){
            play.removePressed(this);
            learn.remove(this);
            stage = Stage.PLAY;
        }
    }
    
    
    public void act(){
        changeStage();
        if(stage == Stage.MENU){
            addObject(learn,learn.getX(), learn.getY());
            addObject(play,play.getX(), play.getY());
        }
        
        
    }
}
