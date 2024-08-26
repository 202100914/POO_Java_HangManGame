import java.util.Scanner;

public class InputReader {

    private Scanner reader;

    public InputReader() {
        reader = new Scanner(System.in);
    }

    public char getChar(String question) {
        if (question == null) {
            question = "";
        }

        System.out.print(" > " + question);

        char answer = reader.next().charAt(0);
        reader.nextLine();

        return answer;
    }
}