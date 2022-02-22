
/**
 * Write a description of class KeylessCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KeylessCar extends Car
{
    public KeylessCar(){
        super();
    }
    //override
    public void toggleEngine(){
            if (isOn){
        isOn=false;
        System.out.println("you turn the button and the engine turns off.");
        }else{
        isOn=true;
        System.out.println("you turn the button and the engine turns on.");
        }
    }
}
