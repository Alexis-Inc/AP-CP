package Inheritance;


/**
 * Write a description of class BlamcoMacnCheese here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlamcoMacnCheese extends Consumable
{
    public BlamcoMacnCheese(int Health){
        super("BlamcoMacnCheese",Health,10, 10);
    }
    
    public int Heal(){
        Health+=Heal;
        if (Health <151 && Quan> 0){
        Quan -= 1;
        
       } 
       else if( Quan<1){
           System.out.println("You are out of MacNCheese");
           Health-=Heal;
        }
       else{
           System.out.println("You seem to be full");
           Health-=Heal;
        }
       return Health;
    }
}
