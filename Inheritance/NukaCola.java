
/**
 * Write a description of class NukaCola here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NukaCola extends Consumable
{
    public NukaCola(){
        
    }
    
    int consume(){
       if (Health <150 || Health <115 && Quan> 0){
        Quan -= 1;
        Health+=35;
       } 
       else if( Quan<1){
           System.out.println("You are out of NukaCola");
        }
       else{
           System.out.println("You are at full Health ");
        }
       return Health;
    }
    
}
