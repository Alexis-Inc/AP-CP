
/**
 * Abstract class LaserRifle - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    int damage;
    boolean parry;
    public Weapon(int Health, int dmg){
        super(Health);
        this.damage = dmg;
    }
    public int attack(){
        return damage;
    }
    public boolean parry(){
        return parry;
     }

}
    
