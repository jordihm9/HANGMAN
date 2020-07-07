package hangman;

import java.util.ArrayList;

public class Round {
    private Player player;
    private int errors = 0;
    private ArrayList<String> letters = new ArrayList<String>();
    private boolean finished = false;
    private boolean won = false;
    private Word word;

    public Round(Word word, Player player) {
        this.word = word;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public int getErrors() {
        return errors;
    }

    public boolean startRound() {

        char[] guess = new char[word.getNumOfLetters()];
        String playerGuess;
        boolean letterFounded;

        for (int i = 0; i < guess.length; i++) {
            guess[i] = '_';
        }

        Menus.informing("The word have " + word.getNumOfLetters() + " letters.");

        Menus.asking("Letter: ");
        playerGuess = (String) Main.in.next().toUpperCase();

        do {

            if (playerGuess.length() > 1) {
                if (playerGuess.equals(word.getWord())) {
                    finished = true;
                    won = true;
                } else {
                    errors++;
                }
            } else {
                letterFounded = false;
                for (int i = 0; i < word.getNumOfLetters(); i++) {
                    if (playerGuess.charAt(0) == word.getWord().charAt(i)) {
                        guess[i] = playerGuess.charAt(0);
                        letterFounded = true;
                    }
                }

                if (!letterFounded) {
                    errors++;
                }
            }

            switch (errors) {
                case 1:
                    HangmanState.stage1();
                    break;
                case 2:
                    HangmanState.stage2();
                    break;
                case 3:
                    HangmanState.stage3();
                    break;
                case 4:
                    HangmanState.stage4();
                    break;
                case 5:
                    HangmanState.stage5();
                    break;
                case 6:
                    HangmanState.stage6();
                    break;
                case 7:
                    HangmanState.stage7();
                case 8:
                    HangmanState.death();
                    finished = true;
                    Menus.informing("The word was " + word.getWord() + ".");
                    break;
            }

            if (!finished) {
                Menus.printGuessLine(guess);
                letters.add(playerGuess);
                Menus.advice("\nLetters used:");
                for (String letter: letters) {
                    System.out.print(letter + " ");
                }
                Menus.asking("\nLetter: ");
                playerGuess = (String) Main.in.next().toUpperCase();
            }
            
        } while(!finished);

        if (won) {
            HangmanState.won();
        }
        return won;
    }
}
