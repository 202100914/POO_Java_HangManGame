public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private static int numberOfTries;

    public WordGuessingGame(){
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public String getGuessedWord() {
        return guessedWord;
    }

    public static int getNumberOfTries() {
        return numberOfTries;
    }

    public void showGuessedWord(){
        System.out.println(getGuessedWord());
    }
}
