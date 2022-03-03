package Inheritance;


/**
 * Write a description of class NukaCola here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NukaCola extends Consumable
{

    public NukaCola(int Health){
        super(Health, 10, 35);
    }
    
    public int Heal(){
        Health+=Heal;
        if (Health <150 && Quan> 0){
        Quan -= 1;
        
       } 
       else if( Quan<1){
           System.out.println("You are out of NukaCola");
           Health-=Heal;
        }
       else{
           System.out.println("You drinked too much, drink water>:(");
           Health-=Heal;
        }
       return Health;
    }
    
}
