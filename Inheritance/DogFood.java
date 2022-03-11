package Inheritance;


/**
 * Write a description of class DogFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DogFood extends Consumable
{
    public DogFood(){
        super("DogFood",10, 25);
    }
    
        public int Heal(){
    
        if (Health <150 && Quan> 0){
        Quan -= 1;
                for( int i=0 ; i < Heal;i++){
            if (Health <150){
                Health +=1;
            }
        }
       } 
       else if( Quan<1){
           System.out.println("You are out of DogFood");
           
        }
       else{
           System.out.println("You seem to be full");
           
        }
       return Health;
    }
}
