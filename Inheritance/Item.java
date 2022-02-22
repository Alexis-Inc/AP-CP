
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
    public Item(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
        public int EnergyCell(){
        int EC=500;
        return EC;
    }
}

