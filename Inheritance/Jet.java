package Inheritance;


/**
 * Write a description of class Jet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jet extends Chems
{
    int Takes=0;
    public Jet(){
        super("Jet");
    }
    
    public void use(){
        System.out.println("You feel alot slower");
        Takes++;
        if (IsAddicted == true){
            Health -=10;
            Takes = 0;
        }
        else if (Takes > 5){
            System.out.println("You are addicted to Jet");
            Health -=10;
            IsAddicted = true;
        }
    }
    public void deepUse(){
        System.out.println("You feel your heart race and feel as if your body is barely moving");
        Takes+=3;
        if (IsAddicted == true){
            Health -=10;
            Takes = 0;
        }
        else if (Takes > 5){
            System.out.println("You are addicted to Jet");
            Health -=10;
            IsAddicted = true;
        }
    }
    }

