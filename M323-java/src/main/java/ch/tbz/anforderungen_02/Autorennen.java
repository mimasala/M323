package ch.tbz.anforderungen_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Autorennen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> autoNamen = new ArrayList<>();
        List<List<Double>> rundenZeiten = new ArrayList<>();

        while (true) {
            System.out.println("Geben Sie den Namen des Autos ein (oder 'fertig' zum Beenden):");
            String autoName = scanner.nextLine();
            if (autoName.equalsIgnoreCase("fertig")) {
                break;
            }
            autoNamen.add(autoName);

            List<Double> zeiten = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.println("Geben Sie die Rundenzeit " + i + " für " + autoName + " ein:");
                double zeit = scanner.nextDouble();
                zeiten.add(zeit);
            }
            rundenZeiten.add(zeiten);
        }

        for (int i = 0; i < autoNamen.size(); i++) {
            double gesamtzeit = 0;
            for (int j = 1; j < rundenZeiten.get(i).size(); j++) {
                gesamtzeit += rundenZeiten.get(i).get(j);
            }
            double durchschnitt = gesamtzeit / 2;

            System.out.println("Auto: " + autoNamen.get(i));
            System.out.println("Gesamtzeit: " + gesamtzeit + " Sekunden");
            System.out.println("Durchschnittszeit: " + durchschnitt + " Sekunden");
        }

        System.out.println("Vielen Dank für die Nutzung der Autorennen-App!");
    }
}

