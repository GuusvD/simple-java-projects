import java.util.Scanner;

import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();

        int totaal1 = 0;
        int totaal2 = 0;
        String JofN = "j";

        totaal1 = totaal1 + randomNumber.nextInt(12) + randomNumber.nextInt(12);
        System.out.println("Totaal: " + totaal1);

        while (totaal1 < 21) {
            System.out.println("Nog een getal? (j of n)");
            JofN = String.valueOf(scanner.nextLine());
            if (JofN.equals("j")) {
                totaal1 = totaal1 + randomNumber.nextInt(12);
                System.out.println("Je nieuwe totaal is: " + totaal1);
            } else if (JofN.equals("n")) {
                break;
            }
        }
        winConditions(totaal1, totaal2);
        System.exit(0);
    }

    public static void winConditions(int totaal1, int totaal2) {
        Random randomNumber = new Random();

        totaal2 = totaal2 + randomNumber.nextInt(24 - 16 + 1) + 16;
        System.out.println("De tegenstander zijn totaal: " + totaal2);

        if (totaal1 == 21) {
            System.out.println("Gefeliciteerd user");
            System.out.println("Je hebt gewonnen");
            System.exit(0);
        }

        if (totaal1 > 21) {
            System.out.println("Helaas user");
            System.out.println("Je hebt verloren");
            System.exit(0);
        }

        if (totaal1 < 21) {
            if (totaal1 == totaal2) {
                System.out.println("Gefeliciteerd user");
                System.out.println("Je hebt gewonnen");
                System.exit(0);
            } else if (totaal1 > totaal2) {
                System.out.println("Gefeliciteerd user");
                System.out.println("Je hebt gewonnen");
                System.exit(0);
            } else if (totaal2 > 21) {
                System.out.println("Gefeliciteerd user");
                System.out.println("Je hebt gewonnen");
                System.exit(0);
            }
        }
        System.out.println("Helaas user");
        System.out.println("Je hebt verloren");
        System.exit(0);
    }
}