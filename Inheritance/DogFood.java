package Inheritance;


/**
 * Write a description of class DogFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DogFood extends Consumable
{
    public DogFood(int Health){
        super("DogFood",Health,10, 25);
    }
    
        public int Heal(){
        Health+=Heal;
        if (Health <151 && Quan> 0){
        Quan -= 1;
        
       } 
       else if( Quan<1){
           System.out.println("You are out of DogFood");
           Health-=Heal;
        }
       else{
           System.out.println("You seem to be full");
           Health-=Heal;
        }
       return Health;
    }
}
