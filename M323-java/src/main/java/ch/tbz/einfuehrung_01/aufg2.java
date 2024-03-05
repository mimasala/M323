package ch.tbz.einfuehrung_01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aufg2 {
    public static double getDiscountPercentage(List<String> items) {
        Map<String, Double> discounts = new HashMap<>();
        discounts.put("Buch", 0.05);
        discounts.put("Elektronik", 0.1);
        discounts.put("Kleidung", 0.2);

        return items.stream()
                .map(item -> discounts.getOrDefault(item, 0.0)).mapToDouble(f -> f).sum();
    }

}
