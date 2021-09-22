
/**
 * Write a description of class ReadingInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; //we are using it, but not on AP test
public class ReadingInput
{
    public static void main(){
        int a = 10;
        Scanner scanner;  //Declaration
        scanner = new Scanner(System.in); //instantiation
        System.out.println("what is your name?");
        String name = scanner.next ();
        System.out.println("Hello" + name);
        System.out.println("What is quest?");
        String quest = scanner.next();
        System.out.println("What is your favorite color?");
        String color = scanner.next();
    }
}
