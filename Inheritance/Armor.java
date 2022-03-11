package Inheritance;


/**
 * Abstract class Armor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Armor extends Item implements ArmorInterface 
{
    boolean On;
    int EXHealth;
    int Health;
    public Armor(String name, int EXHealth){
        super(name);
        On=false;
        this.EXHealth=EXHealth;
        this.Health=100;
    }
    public boolean isOn(){
        return On;
    }
    }
    

