import java.util.Scanner;

public class Verjaardagskalender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][][] dates = new String[13][32][5];

        while (true) {
            System.out.println("Verjaardagskalender 0.1");
            System.out.println("Kies een optie: (1/2/3)");
            System.out.println("1. Verjaardag toevoegen");
            System.out.println("2. Verjaardag verwijderen");
            System.out.println("3. Alle verjaardagen zien");
            int chosen = Integer.valueOf(scanner.nextLine());

            if (chosen == 1) {
                option1(dates);
            }

            if (chosen == 2) {
                option2(dates);
            }

            if (chosen == 3) {
                option3(dates);
            }
        }
    }

    public static void option1(String[][][] dates) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie is er jarig?");
        String addPerson = scanner.nextLine();
        System.out.println("Op welke dag?");
        int Day = Integer.valueOf(scanner.nextLine());
        System.out.println("Van welke maand?");
        int Month = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < 5; i++) {
            if (dates[Month][Day][i] == null) {
                dates[Month][Day][i] = addPerson;
                System.out.println("Verjaardag opgeslagen!");
                System.out.println("");
                break;
            }
        }
    }

    public static void option2(String[][][] dates) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welke verjaardag wil je verwijderen?");
        String PersonRemove = scanner.nextLine();

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 32; j++) {
                for (int k = 0; k < 5; k++) {
                    if (dates[i][j][k] != null) {
                        if (dates[i][j][k].equals(PersonRemove)) {
                            dates[i][j][k] = null;
                            System.out.println("Verjaardag verwijderd!");
                            System.out.println("");
                        }
                    }
                }
            }
        }
    }

    public static void option3(String[][][] dates) {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 32; j++) {
                for (int k = 0; k < 5; k++) {
                    if (dates[i][j][k] != null) {
                        System.out.println(j + "-" + i + " " + dates[i][j][k]);
                    }
                }
            }
        }
        System.out.println("");
    }
}
