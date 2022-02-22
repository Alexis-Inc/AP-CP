
/**
 * Write a description of class GatlingLazer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GatlingLazer extends Weapon
{
    int ammo = 500;
    public GatlingLazer(String name){
        super(name);
    }
    public void attack(){
     if ( ammo  > 0){
        ammo -= 50;
        System.out.println("pew");
        System.out.println(ammo + " Bullets left");
     }
     else{
         System.out.println("you are out of ammo :(");
                 System.out.println(ammo + " Bullets left");
    }
    }
    public void reload(){
        ammo = 500;
        System.out.println("RELOADING");
        System.out.println(ammo + " Bullets left");
     }
}
