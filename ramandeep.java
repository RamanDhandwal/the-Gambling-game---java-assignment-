//On the top of your Program File you are submitting:
//use comments:
//Name: Ramandeep Kaur dhandwal
//Student ID:201903671
//Date Submitted:03/20/2021
//Class IN2203 Section Number G1
//Name of work: Assignment 1: The gambling Game
package javacode;
import java.util.*;
import java.lang.Math;


public class MainApplicaton {
    public static void main(String[] args){
    Casino c= new Casino();
    c.OrganizeNewGame();
    }
}
class Casino{
    Player p1= new Player();
    Game g1= new Game();
    String userAnswer;
        Scanner s= new Scanner(System.in);
        public void OrganizeNewGame(){
            System.out.println("Welcome to the Casino: Would you like to play a game? (y/n)");
        userAnswer= s.nextLine();
        if(userAnswer.equals("y")){
            System.out.println("let's get started");
                    g1.PlayGame();
                    p1.Play();
}
else
{System.out.println("Good bye");}
}
}
class Game{
    Random r= new Random();
    int ComputerGuess= r.nextInt(100) ;
    
    public void PlayGame(){
        System.out.println("Guess a numner from 1 to 100");
        System.out.println("I'll guess a number now ");
        System.out.println(" If your guess is within 20 of my guess: then you win . Else i will WIN  ");
        ComputerGuess= ComputerGuess();
        
        
    }
     public int ComputerGuess(){
      int programGuess;
       programGuess = r.nextInt(100);
      return programGuess;
     }
}
class Player extends Game{
    String playerName;
    int playerAge;
    Game g2= new Game();
    
    public void Play()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Player's name");
        playerName= sc.nextLine();
        System.out.println("Enter player's Age");
        playerAge= sc.nextInt();
        int trials= 5;
        int guess;
        
        for(int i=1; i<= trials;i++)
        {
            System.out.println("guess a number");
            guess= sc.nextInt();
            
            if(Math.abs(guess - g2.ComputerGuess)<20 )
            {System.out.println("Hurrayyy!! YOU WIN");
                System.out.println("The Number was " + g2.ComputerGuess );
            break;}
            
            else 
            {
                System.out.println(" Try again ");
            }
            if(i==trials)
            {
                System.out.println("Sorry, You have tried too many times");
                System.out.println("The number was"+ ComputerGuess);
            }
            
        }
        
        
    }
    
}
        

