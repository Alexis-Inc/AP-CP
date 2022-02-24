
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
    int health;
    public Item(String name, int health){
        this.name = name;
        this.health=health;
    }
    
    public String getName(){
        return name;
    }
    
        public int EnergyCell(){
        int EC=500;
        return EC;
    }
}

