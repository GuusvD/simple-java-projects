import java.util.Scanner;

public class Film {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film1 = "";
        String film2 = "";
        String film3 = "";

        System.out.println("Voer 1 of 2 of 3 in.");
        String cijfer = String.valueOf(scanner.nextLine());

        if (cijfer.equals("1")) {
            System.out.println("Piratenfilm met de onnavolgbare Johnny Depp als kapitein Jack Sparrow.");
            System.out.println("Welke film word er beschreven?");
            film1 = String.valueOf(scanner.nextLine());

            if (film1.equals("Pirates Of The Caribbean")) {
                System.out.println("Goed");
                System.out.println("Gefeliciteerd");
                System.exit(0);
            } else {
                System.out.println("Fout");
                System.out.println("Het was: Pirates Of The Caribbean");
                System.exit(0);
            }
        } else if (cijfer.equals("2")) {
            System.out.println(
                    "Een eeuwenoude ring, die jaren zoek is geweest, wordt gevonden en komt bij toeval terecht bij de kleine Hobbit Frodo.");
            System.out.println("Welke film word er beschreven?");
            film2 = String.valueOf(scanner.nextLine());

            if (film2.equals("The Lord Of The Rings")) {
                System.out.println("Goed");
                System.out.println("Gefeliciteerd");
                System.exit(0);
            } else {
                System.out.println("Fout");
                System.out.println("Het was: The Lord Of The Rings");
                System.exit(0);
            }
        } else if (cijfer.equals("3")) {
            System.out.println(
                    "Het magische avontuur begint als een jongen een uitnodiging krijgt voor Hogwarts School of Witchcraft and Wizardry.");
            System.out.println("Welke film word er beschreven?");
            film3 = String.valueOf(scanner.nextLine());

            if (film3.equals("Harry Potter")) {
                System.out.println("Goed");
                System.out.println("Gefeliciteerd");
                System.exit(0);
            } else {
                System.out.println("Fout");
                System.out.println("Het was: Harry Potter");
                System.exit(0);
            }
        } else {
            System.out.println("Verkeerde invoer.");
            System.exit(0);
        }
    }
}