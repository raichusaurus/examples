package TargetString;

import java.util.ArrayList;
import java.util.List;

public class WordLister {

    private List<String> wordList;

    // for the sake of the example, don't pass anything but alpha chars or whitespace
    public void setWordList(String words) {
        wordList = new ArrayList<String>();
        String current_word = "";
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ') {
                if (current_word.length() > 0) {
                    wordList.add(current_word);
                    current_word = "";
                }
            }
            else {
                current_word += words.charAt(i);
            }
        }
        if (current_word.length() > 0) {
            wordList.add(current_word);
        }
    }

    public List<String> getWordList() {
        return wordList;
    }

    public static List<String> createWordList(String words) {
        WordLister wordLister = new WordLister();
        wordLister.setWordList(words);
        return wordLister.getWordList();
    }
}
