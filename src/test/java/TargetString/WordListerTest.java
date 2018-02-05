package TargetString;

import TargetString.WordLister;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class WordListerTest {

    @Test
    public void testWordListSize() {
        WordLister wordLister = new WordLister();
        wordLister.setWordList("these are my words");
        assertEquals(wordLister.getWordList().size(), 4);
    }

    @Test
    public void testCreateWordList() {
        List<String> wordList = WordLister.createWordList("these are my words");
        assertEquals(wordList.get(0), "these");
        assertEquals(wordList.get(1), "are");
        assertEquals(wordList.get(2), "my");
        assertEquals(wordList.get(3), "words");
    }
}
