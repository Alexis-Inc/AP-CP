
/**
 * Write a description of class vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vehicle // there is a secret....It auto-extends Object.
{
    String engineType;
    public Vehicle(String engine){
        engineType=engine;
    }
    public Vehicle(){
        engineType="gas powered";
    }
    public void move(){
        System.out.println("you move foward");
    }
    public abstract void moveBackward();
    
}
