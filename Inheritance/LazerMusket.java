package Inheritance;



/**
 * Write a description of class LazerMusket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LazerMusket extends Weapon
{
    int chargeLevel = 0;  
    public LazerMusket(){
        super(0);
    }
    public void charge(){
        if (chargeLevel == 6){
           System.out.println("The musket is too powerful to charge up");
        }        
        if (chargeLevel == 5){
            chargeLevel += 1;
            System.out.println("The Musket is bright red and is roaring");
            damage = 60;
        } 
        if (chargeLevel == 4){
            chargeLevel += 1;
            System.out.println("The static is getting brighter");
            damage = 45;
        }
        if (chargeLevel == 3){
            chargeLevel += 1;
            System.out.println("The static is getting brighter");
            damage = 35;
        }
        if (chargeLevel == 2){
            chargeLevel += 1;
            System.out.println("The static is getting brighter");
            damage = 20;
        }
        if (chargeLevel == 1){
            chargeLevel += 1;
            System.out.println("The static is getting brighter");
            damage = 15;
        }
        if (chargeLevel == 0){
            chargeLevel += 1;
            System.out.println("A static of electricity had sparked");
            damage = 10;
        }
    }
    public int attack(){
        int temp=0;
        
        if (chargeLevel == 6){
            System.out.println("BOOM");
            temp = damage;
            chargeLevel = 0;
            damage = 0;
            return temp;
         }else if (chargeLevel > 0){
            System.out.println("pew");
            temp = damage;
            chargeLevel = 0;
            damage = 0;
            return temp;
        }
        else{
            System.out.println("you need to charge your Lazer Musket"); 
            return 0;
        }
    }
}
