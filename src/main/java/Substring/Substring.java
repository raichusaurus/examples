package Substring;

import java.util.*;

public class Substring {


    public static List<String> getDistinctSubstrings(String fullString, int num) {
        Set<String> distinctSubstrings = new HashSet<String>();

        Set<Character> currentLetters = new HashSet<Character>();
        String currentSubString = "";
        for (int i = 0; i < fullString.length(); i++) {
            char currentChar = fullString.charAt(i);
            currentSubString += currentChar;
            if (!currentLetters.add(currentChar)) {
                currentSubString = currentSubString.substring(1);
            }
            else {
                if (currentLetters.size() > num) {
                    char letterToPop = currentSubString.charAt(0);
                    currentLetters.remove(letterToPop);
                    currentSubString = currentSubString.substring(1);
                }
            }
            if (currentLetters.size() == num) {
                distinctSubstrings.add(currentSubString);
                System.out.println("hello");
            }
            System.out.println(currentSubString);
        }

        return new ArrayList<String>(distinctSubstrings);
    }
}
