public class FullGame {
    private WordGuessingGame wordGuessingGame;
    private InputReader inputReader;

    public FullGame() {
        wordGuessingGame = new WordGuessingGame();
        inputReader = new InputReader();
    }

    public void play(){

        do{
            wordGuessingGame.play();

            System.out.println("Hey!! Parece que o jogo acabou, vais querer continuar a jogar? (S - N)");

            char letter = inputReader.getChar("");

            if (letter == 's') {
                wordGuessingGame.reset();
            } else {
                break;  // Sai do loop e termina o jogo
            }

        }while(true);
    }
}
