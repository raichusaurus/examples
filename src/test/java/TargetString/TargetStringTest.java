package TargetString;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class TargetStringTest {

    @Test
    public void testTargetString() {
        List<String> targets = WordLister.createWordList("use the force");
        List<String> possibilities = WordLister.createWordList("it's no use the force is strong with this one");
        List<Integer> range = TargetString.getTargetRange(targets, possibilities);
        assertEquals((int) range.get(0), 2);
        assertEquals((int) range.get(1), 4);
    }
}
