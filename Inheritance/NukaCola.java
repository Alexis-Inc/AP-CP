package Inheritance;


/**
 * Write a description of class NukaCola here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NukaCola extends Consumable
{

    public NukaCola(){
        super("NukaCola", 10, 35);
    }
    
    public int Heal(){
        
        if (Health <150 && Quan> 0){
        Quan -= 1;
         for( int i=0 ; i <Heal;i++){
            if (Health <150){
                Health +=1;
            }
        }       
       } 
       else if( Quan<1){
           System.out.println("You are out of NukaCola");
           
        }
       else{
           System.out.println("You drinked too much, drink water>:(");
           
        }
       return Health;
    }
    
}
