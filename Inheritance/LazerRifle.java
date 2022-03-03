package Inheritance;


/**
 * Write a description of class LazerRifle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LazerRifle extends Weapon
{
    int ammo = 27;
    public LazerRifle(){
        super(10);
    }
    
    public int attack(){
     if ( ammo  > 0){
        ammo -= 1;
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
        ammo = 27;
        System.out.println("RELOADING");
        System.out.println(ammo + " Bullets left");
     }
}
