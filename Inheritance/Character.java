package Inheritance;


/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    Weapon primary;
    Backpack backpack;
    public Character(){
        backpack = new Backpack();
        Weapon rifle = new LazerRifle(100);
        backpack.storeItem();
    }
}
