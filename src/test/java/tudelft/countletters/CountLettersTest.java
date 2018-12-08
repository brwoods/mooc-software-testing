package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordDoesMatch() {
        int words = new CountLetters().count("cat|dogs");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void firstWordDoesMatch() {
        int words = new CountLetters().count("as|d");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void firstWordDoesMatchMutipleBlanks() {
        int words = new CountLetters().count("as|||");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void firstWordDoesMatchLastWordContainsLcR() {
        int words = new CountLetters().count("as|doer");
        Assertions.assertEquals(2, words);
    }
    @Test
    public void allWordsMatch() {
        int words = new CountLetters().count("as|doer|dogs|badger");
        Assertions.assertEquals(4, words);
    }

}