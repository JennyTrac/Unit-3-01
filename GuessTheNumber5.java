/* Created by: Jenny Trac
Group members: Malcom, Gavin
Created on: Oct 3 2017
This program asks you to guess the number it's thinking */

import java.util.Scanner;

public class GuessTheNumber5 {

 public static void main(String[] args)
  {
  
  int GUESS_THE_NUMBER = 5;
  
  System.out.println("Enter a number between 1 and 10");
  
    // input
        
  Scanner problem = new Scanner(System.in);
    int number_guess = (problem.nextInt());
    
    // process
    if ((number_guess) == (GUESS_THE_NUMBER)) {
        // output
        System.out.println("You guessed it right!");
    }

 }

}
