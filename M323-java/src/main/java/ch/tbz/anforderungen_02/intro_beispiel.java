package ch.tbz.anforderungen_02;

public class intro_beispiel {
    public static double calculateDiscount(double price) {
        double discountRate = 0.05;
        double discountAmount = price * discountRate;
        double discountedPrice = price - discountAmount;
        return discountedPrice;
    }
    public static void main(String[] args) {
        double originalPrice = 100.0;
        double discountedPrice = calculateDiscount(originalPrice);
        System.out.println("Originalpreis: " + originalPrice);
        System.out.println("Rabattpreis: " + discountedPrice);
    }
}
