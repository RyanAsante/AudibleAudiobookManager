import java.util.ArrayList;
import java.util.List;

//do not worry about this code
public class SpellChecker {
    public SpellChecker() {
    }

    public boolean isSpelledCorrect(String word){

        List<String> incorrectWords = new ArrayList<>();
        incorrectWords.add("Obamaaa");
        incorrectWords.add("Harrie");

        for (String incorrectWord : incorrectWords){
            if (word.contains(incorrectWord)){
                return false;

            }

        }
        return true;
    }
}
