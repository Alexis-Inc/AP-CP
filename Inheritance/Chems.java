package Inheritance;


/**
 * Abstract class Aid - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Chems extends Item
{
    int Health;
    boolean IsAddicted;
    public Chems(String name){
        super(name);
        this.Health=100;
        this.IsAddicted= false;
    }
    
}
