
/**
 * Abstract class LaserRifle - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Weapon extends Item implements WeaponInterface
{
    int damage;
    boolean parry;
    public Weapon(String name, int dmg){
        super(name,dmg);
        damage = dmg;
    }
    public int attack(){
        return damage;
    }
    public boolean parry(){
        return parry;
    }

}
    
