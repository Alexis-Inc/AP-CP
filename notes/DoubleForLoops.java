
/**
 * Write a description of class DoubleForLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleForLoops
{
    public static void main1(){
        for (int i = 1; i < 6; i++){
            for(int j = 1; j < 6; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }    
    }

    public static void main2(){
        for (int i = 1; i < 6; i++){
            for(int j = 0; j < 6 - i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }    
    }

    public static void main3(){
        for (int i = 1; i < 6; i++){
            for(int j = 2; j < 2 + i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main4(){
        for (int i = 5; i > 0; i--){
            for(int j = 1; j < i + 1 ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main5(){
        for (int i = 5; i > 0; i--){  //The number that gets printed
            for(int j = 6; j > i ; j--){  //The number of times it is printed
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}