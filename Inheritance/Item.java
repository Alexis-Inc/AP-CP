
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
    int Health;
    
    public Item(int Health){
        this.Health=Health;
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

