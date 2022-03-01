
/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle //There can ONLY BE ONE SUPERCLASS!!!!!
{
    int numberOfDoors;
    boolean isOn;
    public Car(){
        super();
        numberOfDoors = 4;
        isOn=false;
    }
    public Car(String engine, int doors){
        super(engine);
        numberOfDoors=doors;
        isOn=false;
    }
    
    //This overrides the abystract method in Vehicle
    public void moveBackward(){
        System.out.println("you move backwards");
     }
    public void toggleEngine(){
        if (isOn){
        isOn=false;
        System.out.println("you turn the key and the engine turns off.");
        }else{
        isOn=true;
        System.out.println("you turn the key and the engine turns on.");
        }
    }
}
