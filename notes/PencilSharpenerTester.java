
/**
 * Write a description of class PencilSharpenerTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PencilSharpenerTester
{
    public static void main(){
        PencilSharperner mySharperner;
        mySharperner = new PencilSharperner();
        
        
        PencilSharperner yourSharperner = new PencilSharperner("Steel", "red",
        "Swingline", 100.6, 5);
        System.out.println("I throw pencil Sharpener. ");
        String result = mySharperner.throwSharperner(); 
        System.out.println(result);
        
        System.out.println("I throw my Pencil sharpener again");
        System.out.println(mySharperner.throwSharperner());
        System.out.println("this is my " +mySharperner.getBrand() + " sharpener. ");
    }
}