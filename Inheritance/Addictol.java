package Inheritance;


/**
 * Write a description of class Addictol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Addictol extends Chems
{
    public Addictol(){
        super("Addictol");
    }
    
    public void Use(){
        if (IsAddicted == true){
            IsAddicted=false;
            System.out.println("You are no longer addicted to any chems");
        }
        else{
            System.out.println("You are not Addicted to any Chems");
        }
    }
    
    }

