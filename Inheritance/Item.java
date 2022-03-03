package Inheritance;


/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    //Implemented in your own way
    String name;
    
    public Item(String nm){
        name = nm;
    }
    public String getName(){
        return name;
    }
        // public int Health(){
        // Health = 100;
        // return Health;
    // }
        public int EnergyCell(){
        int EC=500;
        return EC;
    }
}

