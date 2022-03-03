package Inheritance;


/**
 * Abstract class Armor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Armor extends Item implements ArmorInterface 
{
    boolean PutOn;
    int EXHealth;
    int Health;
    public Armor(boolean PutOn, int EXHealth,int Health){
        super();
        this.PutOn=PutOn;
        this.EXHealth=EXHealth;
        this.Health=Health;
    }
    public boolean PutOn(){
        return PutOn;
    }
    
    }
    

