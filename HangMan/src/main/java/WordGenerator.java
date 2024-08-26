import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WordGenerator {
    private ArrayList<String> words;
    private Random rand;

    public WordGenerator() {
        fillArrayList();
        rand = new Random();
    }

    private void fillArrayList(){
        words = new ArrayList<>(Arrays.asList( "boolean", "break", "byte", "case", "char", "class", "continue",
                                                "do", "double", "else", "enum", "for", "if", "import", "int"));
    }

    public String generateWord(){
        int randomNumber = rand.nextInt(words.size());

        return words.get(randomNumber);
    }

    public void addWord(String word){
        if (!words.contains(word)) {
            words.add(word);
        }
    }
}
