
public class Main {

    public static void main(String[] args) {
        InputReader inputReader = new InputReader();

        // Teste básico com uma pergunta
        char input = inputReader.getChar("Digite uma letra: ");

        // Imprime o caractere que foi digitado
        System.out.println("Você digitou: " + input);

        // Encerrando o programa
        System.exit(0);
    }
}

