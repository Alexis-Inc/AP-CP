
/**
 * Write a description of class BooleanLogic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BooleanLogic
{
  public static void main(){
    boolean a = true;
    boolean b = false;
    boolean c = true;
    System.out.println(a);
    System.out.println(a && b); // A and B (Both critera must be true)
    System.out.println(!a); // Not A (It swaps the boolean value)
    System.out.println(a || b); // A and B (only one critera needs to be true)
    System.out.println(!a && !b); //
    System.out.println(!(a || b)); //
  }    
  public static void main2(){
      boolean a = true;
      boolean b = true;
      boolean c = false;
      System.out.println(a || b && c);



    }
  public static void gradeThis(int percentage){ 
      /*if (criteria){
            What happens if it is true
        }
        */

      if(percentage >= 90){
           System.out.println("you get an A");
        } else if(percentage >= 80 && percentage < 90){
            System.out.println("you get a B");
        } else if(percentage >=70){
            System.out.println("you get a C");
        } else if(percentage >=60){
           System.out.println("you get a D"); 
        }else {
            System.out.println("you fail!");
        } 
    }
public static String BettergradeThis(int percentage){ 

      if(percentage >= 90){
           return"you get an A";
        } else if(percentage >= 80 && percentage < 90){
            return"you get a B";
        } else if(percentage >=70){
            return"you get a C";
        } else if(percentage >=60){
           return"you get a D"; 
        }else {
            return"you fail!";
        }
    
    }
}





