package ch.tbz.einfuehrung_01;

public class aufg1 {
    public static int wordScore(String word) {
        return word.replace("a", "").replace("A", "").length();
    }
}
