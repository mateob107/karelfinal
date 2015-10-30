import kareltherobot.*;
/**
 * Write a description of class TreasureHunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarpetBot extends Robot
{
    public CarpetBot(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }

    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void carpetRoom()
    {
        putBeeper();
    }

    public boolean checkRoom()
    {
        boolean result = true;
        carpetRoom();
        return result;
    }

    public boolean checkLeftWall()
    {
        boolean result = true;
        turnLeft();
        return result;
    }

    public boolean checkRightWall()
    {
        boolean result = true;
        turnRight();
        return result;
    }

    //The Main Proogram

    public void work() 
    {
        while (frontIsClear()) {
            move();
            if(checkLeftWall()){
                turnLeft();
                
            }
        }
    }

    
    
    
    
}
