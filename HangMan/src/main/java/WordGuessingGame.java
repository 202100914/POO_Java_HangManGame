public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private static int numberOfTries;
    private InputReader reader;
    private WordGenerator wordGenerator;

    public WordGuessingGame(){
        this.wordGenerator = new WordGenerator();
        this.hiddenWord = wordGenerator.generateWord();
        this.guessedWord = initializeGuessedWord(hiddenWord.length());
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
        char cheat = '*';

        showWelcome();

        do{
            char letter = reader.getChar("");

            if (letter == cheat) {
                System.out.println("Cheat ativado! A palavra escondida é: " + getHiddenWord());
                continue; // Salta para a próxima iteração do loop
            }

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

    private String initializeGuessedWord(int length){
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < length; i++){
            str.append("_");
        }

        return str.toString();
    }

    public void reset(){
        this.hiddenWord = wordGenerator.generateWord();
        this.guessedWord = initializeGuessedWord(hiddenWord.length());
        this.numberOfTries = 0;
    }
}
