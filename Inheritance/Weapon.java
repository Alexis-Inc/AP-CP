
/**
 * Abstract class LaserRifle - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    int dmg;
    boolean parry;
    public Weapon(int dmg){
        this.dmg = dmg;
    }
    public int attack(){
        return dmg;
    }
    public boolean parry(){
        return parry;
    }

}
    
