
/**
 * Write a description of class Consumable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Consumable extends Item
{
    int Quan;
    int Health;
    public Consumable(String name, int Health){
        super(name,100);
    }
    
    public int Quan(){
        return Quan;
    }
}
