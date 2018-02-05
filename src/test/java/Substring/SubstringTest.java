package Substring;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class SubstringTest {

    @Test
    public void testGetDistinctSubstrings() {
        String dogs = "dogdog";
        assertEquals(Substring.getDistinctSubstrings(dogs, 1).size(), 3);
        assertEquals(Substring.getDistinctSubstrings(dogs, 2).size(), 3);
        assertEquals(Substring.getDistinctSubstrings(dogs, 3).size(), 3);
        assertEquals(Substring.getDistinctSubstrings(dogs, 4).size(), 0);
        assertEquals(Substring.getDistinctSubstrings(dogs, 5).size(), 0);
        assertEquals(Substring.getDistinctSubstrings(dogs, 6).size(), 0);
    }
}
