
/**
 * Write a description of class Variables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Variables
{
    private static int b = 100;
    // Two slashes creates a comment
    public static void main(){
        System.out.print("This prints on one...");
        System.out.print("line");
        System.out.println("!"); //The new line appears after the new text.
        int a = 5;
}
    public static void main2(){
        //The declearation allocates memory, and variable lifespan
        int a;  //Declaration or variable a.
        
        
        a = 15; //Instantiating the variable "a" to 15.
        if (a == 15){
            int c = 4;
            
        }   
        System.out.println(b); 
}
public static void main3(){
        int a = 4;
        int b = 2;
        int c = 5;
        System.out.println(a + b); //6
        System.out.println(a - b); //2
        System.out.println(a*b); //8
        System.out.println(a/b); //2
        System.out.println(c/b); //2 (integer division. no decimal allowed)
        System.out.println((double)c/b); //2 - c is now a double
        System.out.println(29/10); //2 (integer division)
        System.out.println(29/10.); //2.9 (10 is now a double)
        
        //odd stuff (Modulus)
        System.out.println(5 % 2);
        System.out.println(10 % 2);
        System.out.println(25 % 4);
        //If you want to check for divisbility
        //check to see if the remainder is 0
        
 
    }  

    
    
/** This method uses a scanner to ask for a person's name.
 * 
 */


public static void inputName (){
    Scanner theThing = new Scanner (System.in);
    System.out.println("whats your name");
    String name = theThing.next();
    System.out.println("Hello " + name);
}


/**Asks the user for an interger and prints it.
 * 
 */
public static void aNumber(){
   Scanner theThing = new Scanner (System.in);
    System.out.println("what is your number");
    int number = theThing.nextInt();
    System.out.println("Your number is " + number);
    System.out.println("The next number would be" + number + 1);
    int nextNum = 1;
    System.out.println("The next number would be " + nextNum);
}

public static void aBetterNumber(){
   Scanner theThing = new Scanner (System.in);
    System.out.println("what is your number");
    int number = theThing.nextInt();
    System.out.println("Your number is " + number);
    System.out.println("The next number would be" + number + 1);
    number++;
    System.out.println("The next number would be " + number);
    number--;
    System.out.println(number);
}
}
