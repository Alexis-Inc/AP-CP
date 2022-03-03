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
        backpack.storeItem(LazerRifle);
    }
}
