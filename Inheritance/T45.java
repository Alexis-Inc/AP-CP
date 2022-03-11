package Inheritance;


/**
 * Write a description of class T45 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class T45 extends Armor
{
    public T45(){
        super("T-45",100);
    }
    
    public void PutOn(){
        if (On == true){
         System.out.println("You already have armor on");
         
        }
        else{
         System.out.println("You put on T-45 Power Armor");
         Health += EXHealth;
         On= true;
        }
    }
    
    public void takeOff(){
        if (On == false){
            System.out.println("you have no Armor to take off");
        }
        else{
           System.out.println("You have removed your armor");
           Health -= EXHealth;
           On= false;
        }
    }
}
