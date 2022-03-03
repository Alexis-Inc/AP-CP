package Inheritance;


/**
 * Write a description of class WoodenArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WoodenArmor extends Armor
{
        public WoodenArmor(){
        super("WoodenArmor",25); 
    }
    
        public void PutOn(){
        if (On == true){
         System.out.println("You already have armor on");
         
        }
        else{
         System.out.println("You put on WoodenArmor Armor");
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
