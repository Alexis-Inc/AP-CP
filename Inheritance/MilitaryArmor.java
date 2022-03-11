package Inheritance;


/**
 * Write a description of class MilitaryArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MilitaryArmor extends Armor
{
    public MilitaryArmor(){
        super("MilitaryArmor",50); 
    }
    
        public void PutOn(){
        if (On == true){
         System.out.println("You already have armor on");
         
        }
        else{
         System.out.println("You put on Military issue Armor");
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
