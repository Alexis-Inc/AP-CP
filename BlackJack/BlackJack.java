
/**
 * Write a description of class BlackJack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BlackJack
{
    public static void main(){
        Scanner scanner = new Scanner(System.in);        
        Hand player = new Hand();
        Hand dealer = new Hand();        
        System.out.println("Welcome your cards are " + player.getCard1() + " and " + player.getCard2());
        System.out.println("you have a total of " + player.getTotal());
        System.out.println("The dealers cards are " + dealer.getCard1() + " and  ?");
        System.out.println("hit or stay");
        String Choice = "";

        while (player.getTotal() < 21 && !Choice.equals("stay")){
            Choice = scanner.next ();
            if (Choice.equals("hit")){
                int newCard = (int)(Math.random()*7 + 2);
                System.out.println("Your next card is " + player.hit());
                System.out.println("Your total is " + player.getTotal());
            }
            else{
                System.out.println("hit or stay");
            }
            if (Choice.equals("stay")){
                System.out.println("You have stopped at " + player.getTotal());
            }
            if (player.getTotal() > 21){
                System.out.println("Dealer:LOL YOUR BAD GET GOOD");            
            }
            if (player.getTotal() == 21){
                System.out.println("Dealer:WHAT EVER YOUR JUST LUCKY");
            }       
        }   

        while (dealer.getTotal() < 17 && player.getTotal() < 21){        
            System.out.println("The dealer's total is: " + dealer.getTotal());
            if (dealer.getTotal() < 17){
                System.out.println("The dealer has hit and got a " + dealer.hit());
            }
            if (dealer.getTotal() > 17){ 
                System.out.println("The dealer has gotten a total of " + dealer.getTotal());
            }
            if (dealer.getTotal() > 21){
                System.out.println("Dealer:DANG IT I LOST");            
            }
            if (dealer.getTotal() == 21){
                System.out.println("Dealer:LETS GOOOOOOO I WON");
            }
            
        }
        if (dealer.getTotal() == player.getTotal() && dealer.getTotal() < 21 && player.getTotal() < 21){ 
            System.out.println("Dealer:GG we tied");
        }
        if (dealer.getTotal() > player.getTotal() && dealer.getTotal() < 21 && player.getTotal() < 21){ 
            System.out.println("Dealer:I WIN");
        }
        if (dealer.getTotal() < player.getTotal() && dealer.getTotal() < 21 && player.getTotal() < 21){ 
            System.out.println("Dealer:GG you won");
        }
    }
}
