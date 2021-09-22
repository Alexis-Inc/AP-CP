
/**
 * Write a description of class PencilSharperner here.
 *
 * @author Alexis
 * @version 9.9.21
 */
public class PencilSharperner{

    //Things a pencil sharper has
    //we call these private instance variables, or fields.  
    private String blade;
    private String color;
    private String brand;
    private double weight;
    private int size;
    private boolean broken;
    //Constructors
    public PencilSharperner(String theBlade, String theColor,
    String theBrand, double lbs, int theSize){
        blade = theBlade;
        color = theColor;
        size = theSize;
        brand = theBrand;
        weight = lbs;    
        broken = false;
    }

    public PencilSharperner(){
        blade = "paper";
        color = "Black";
        brand = "NoName";
        weight = 1.7;
        size = 3;
        broken = false;
    }

    public String sharpenPencil(){
        return "You sharpen a pencil";

    }

    public String throwSharperner(){
        if(!broken){
            broken = true;
            return "It's now broken. good job.";
        }
        return "It's already broken";}

    public String getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

    public boolean isBroken(){
        return broken;
    }    
}
