//create a guess word game

import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        boolean ling= false;
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();
        System.out.println("guess the word you like from here");

        // create a word bank
        String[] words = { "apple", "banana", "cherry", "date", "elderberry" };

        // select a random word from the word bank
        int randomIndex = (int) (Math.random() * words.length);
        String secretWord = words[randomIndex];
        int attempts = 0;
        if(secretWord == word)
        {
            System.out.println("Congratulations, you guessed the word correctly!");
            
            attempts++;
        }
        // initialize a variable to keep track of the number of attempts made

      

        // initialize a variable to keep track of the letters guessed correctly
        String guessedLetters = "";
        ling = true;
        while (attempts < 10 && !secretWord.equals(guessedLetters)  ) {
            // display the current state of the game
            System.out.println("Attempts: " + attempts++  + "/" + 10);
          
        }



      //  System.out.print("Enter your guess: ");
      //  String userGuess = scanner.nextLine().toLowerCase();
    
        // check if the user guess is a valid letter
       //if (userGuess.length() != 1 || !Character.isLetter(userGuess.charAt(0))) {
       //     System.out.println("Invalid input. Please enter a single letter.");
          
       // }
    }
}
    //continue
//get user input
