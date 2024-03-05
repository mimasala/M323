package ch.tbz.einfuehrung_01;

import java.util.List;

public class aufg3 {
    public static int calculateTipPercentage(List<String> names) {
        int tipPercentage = 0;
        int groupSize = names.size();

        if (groupSize > 0) {
            tipPercentage = groupSize > 5 ? 20 : 10;
        }

        return tipPercentage;
    }
}
