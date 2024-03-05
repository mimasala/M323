package ch.tbz.anforderungen_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reiseplanung {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> destinationen = new ArrayList<>();

        // Eingabe der Destinationen
        while (true) {
            System.out.println("Geben Sie eine Destination ein (oder 'fertig' zum Beenden):");
            String destination = scanner.nextLine();
            if (destination.equalsIgnoreCase("fertig")) {
                break;
            }
            destinationen.add(destination);
        }

        // Ausgabe der Destinationen
        System.out.println("Ihre Reise führt Sie zu folgenden Destinationen:");
        for (String destination : destinationen) {
            System.out.println("- " + destination);
        }

        // Ändern der Route (optional)
        System.out.println("Möchten Sie die Route ändern? (j/n)");
        String aenderung = scanner.nextLine();
        if (aenderung.equalsIgnoreCase("j")) {
            // Implementierung der Änderung der Route
            // ...
        }

        System.out.println("Vielen Dank für die Nutzung der Reiseplanung!");
    }
}
