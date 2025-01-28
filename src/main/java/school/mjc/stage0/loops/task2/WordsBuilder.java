package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }
    }
}
