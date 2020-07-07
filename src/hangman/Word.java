package hangman;

public class Word {
    private String word;
    private int numOfLetters;

    public Word(String word) {
        this.word = word.toUpperCase();
        numOfLetters = word.length();
    }

    public String getWord() {
        return word;
    }

    public int getNumOfLetters() {
        return numOfLetters;
    }
}
