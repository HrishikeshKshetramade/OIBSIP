import java.util.Random;
import java.util.Scanner;
public class NumberGuessing{
    public static void main(String[] args) {
        Random number=new Random();
        int user_number=number.nextInt(100);
        int chance=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("     NumberGuessing_game        ");
        System.out.println("Guess the number(1-100): ");
        int guess;
        int i=0;
        boolean win=false;
        while(!win){
            guess=sc.nextInt();
            chance++;
        if (guess==user_number){
            win=true;
        } else if (i>8) {
            System.out.println("you lost the game");
            return;
        } else if (guess>user_number) {
            i++;
        System.out.println("your number is higher plz guess low number");
        } else if (guess<user_number) {
            i++;
            System.out.println("your number is lower plz guess high number");
        }
        }
        System.out.println("The right number was:"+user_number);
        System.out.println("the no of Chance where"+chance);
        System.out.println("your score is "+((8-chance)*10)+"out of 100");


    }
}