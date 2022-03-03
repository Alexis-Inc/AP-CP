package Inheritance;


/**
 * Write a description of class Consumable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Consumable extends Item  implements Consume
{
    int Quan;
    int Heal;
    int Health;
    public Consumable(int Health, int Quan, int Heal){
        this.Health=100;
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
