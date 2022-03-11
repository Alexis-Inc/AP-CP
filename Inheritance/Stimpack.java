package Inheritance;


/**
 * Write a description of class Stimpack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stimpack extends Chems
{
    public Stimpack(){
        super("Stimpack");
    }
    
    public void use(){
         if (Health <150){
            for( int i=0 ; i <60;i++){
                if (Health <150){
                Health +=1;
                }
        }
    }
}
}
