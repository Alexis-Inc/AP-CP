
/**
 * Write a description of class GatlingLazer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GatlingLazer extends Weapon
{
    int ammo = 500;
    public GatlingLazer(int Health, int dmg){
        super(Health, 40);
    }
    public int attack(){
     if ( ammo  > 0){
        ammo -= 50;
        System.out.println("pew");
        System.out.println(ammo + " Bullets left");
        return damage;
     }
     else{
         System.out.println("you are out of ammo :(");
                 System.out.println(ammo + " Bullets left");
         return 0;
    }
    }
    public void reload(){
        ammo = 500;
        System.out.println("RELOADING");
        System.out.println(ammo + " Bullets left");
     }
}
