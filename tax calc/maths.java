
/**
 * Write a description of class Variables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class maths
{
public static void aNumber(){
    Scanner happy = new Scanner (System.in);
     System.out. println("Math Tec what is your gross income");
     double number = happy.nextDouble();
     System.out.println("your gross income is " + number);
     double incomeSoFar = number - 10000;
     System.out. println("How many dependents do you have");
     int number2 = happy.nextInt();
     double DependMon = (incomeSoFar - 2000 * number2);
     System.out.println("your income tax is " + DependMon * .2);
     System.out.println("Thank You for using Math Tec good day:3");
}
}