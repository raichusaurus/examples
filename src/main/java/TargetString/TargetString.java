package TargetString;

import java.util.ArrayList;
import java.util.List;

public class TargetString {

    public static List<Integer> getTargetRange(List<String> targets, List<String> possibilities) {

        List<Integer> range = new ArrayList<Integer>();

        if (targets.size() == 0 || possibilities.size() == 0) {
            return range;
        }

        int currentStart = possibilities.indexOf(targets.get(0));
        int worstFinish = possibilities.lastIndexOf(targets.get(targets.size() - 1));
        int bestStart = currentStart;
        int bestFinish = worstFinish;

        if (currentStart < 0 || worstFinish < 0 || worstFinish < currentStart) {
            return range;
        }

        int currentTarget = 0;

        boolean needsRevisit = true; // possible new start found
        while (needsRevisit) {
            needsRevisit = false;
            for (int i = currentStart; i < worstFinish; i++) {
                System.out.println(bestStart + ", " + bestFinish);
                if (possibilities.get(i).equals(targets.get(currentTarget))) {
                    if (currentTarget == targets.size()) {
                        if (i - currentStart < bestFinish - bestStart) {
                            bestStart = currentStart;
                            bestFinish = i;
                            currentTarget = 0;
                            break;
                        }
                    }
                    if (currentTarget == 0) {
                        currentStart = i; // start here next time through
                    }
                    currentTarget++;
                } else if (possibilities.get(i).equals(targets.get(0)) && needsRevisit == false) {
                    currentStart = i; // start here next time through
                    needsRevisit = true; // possible new start found
                }
            }
        }

        range.add(bestStart);
        range.add(bestFinish);

        return range;
    }
}
