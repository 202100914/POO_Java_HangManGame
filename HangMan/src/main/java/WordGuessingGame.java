public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private static int numberOfTries;
    private InputReader reader;

    public WordGuessingGame(){
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
        reader = new InputReader();
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

    public void play(){
        showWelcome();

        do{
            char letter = reader.getChar("");

            guess(letter);

            showGuessedWord();
            numberOfTries++;
        }while (!guessedWord.equals(hiddenWord));

        System.out.println("Parabéns! Você adivinhou a palavra " + hiddenWord);
        System.out.println("Numero de tentativas: " + getNumberOfTries());
    }

    private void showWelcome(){
        String titulo = "*********************************";
        String mensagem = "    BEM-VINDO AO JOGO DA FORCA";
        String instrucoes = "  Tente adivinhar a palavra " + guessedWord + " letra por letra.";
        String mensagemFinal = "    Boa sorte e divirta-se!";

        System.out.println(titulo);
        System.out.println(mensagem);
        System.out.println(instrucoes);
        System.out.println(mensagemFinal);
        System.out.println(titulo);
    }

    private void guess(char letter){
        boolean isCorrect = false;
        StringBuilder guessedWord = new StringBuilder(this.guessedWord);

        for(int i = 0; i < this.hiddenWord.length(); i++){
            if (this.hiddenWord.charAt(i) == letter){
                isCorrect = true;
                guessedWord.setCharAt(i, letter);
            }
        }

        if(isCorrect){
            this.guessedWord = guessedWord.toString();
            System.out.print("Acertou! ");
        } else {
            System.out.print("Errou! ");
        }
    }

    private void showGuessedWord(){
        System.out.println(getGuessedWord());
    }
}
