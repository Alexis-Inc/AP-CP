
/**
 * Write a description of class Consumable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Consumable extends Item,  implements Consume
{
    int Quan;
    int Heal;
    public Consumable(int Health, int Quan, int Heal){
        super(Health);
        this.Quan = Quan;
        this.Heal=Heal;
    }
    public int Heal(){
        Heal = 0;
        return Heal;
    }
    // public int Quan(){
        // return Quan;
    // }
}
