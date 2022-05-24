import java.util.ArrayList;
import java.util.Scanner;

public class Patiëntdossier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Research> researches = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();

        boolean show = false;

        while (true) {
            System.out.println("Kies een optie: (1/2/3)");
            System.out.println("1. Arts aanmaken");
            System.out.println("2. Onderzoek aanmaken");
            System.out.println("3. Patiënt aanmaken");
            System.out.println("4. Bekijk EPD");
            System.out.println("");
            int chosen = Integer.valueOf(scanner.nextLine());

            if (chosen == 1) {
                System.out.println("Naam arts:");
                String nameDoctor = scanner.nextLine();
                System.out.println("Specialisme:");
                String specialty = scanner.nextLine();
                System.out.println("");

                doctors.add(new Doctor(nameDoctor, specialty));
            } else if (chosen == 2) {
                System.out.println("Naam onderzoek:");
                String nameResearch = scanner.nextLine();
                System.out.println("Uitslag:");
                String result = scanner.nextLine();
                System.out.println("Specialisme:");
                String specialty = scanner.nextLine();
                System.out.println("");

                researches.add(new Research(nameResearch, result, specialty));
            } else if (chosen == 3) {
                System.out.println("Naam patiënt:");
                String namePatient = scanner.nextLine();
                System.out.println("Geboortedatum:");
                String birthDate = scanner.nextLine();
                System.out.println("Geslacht:");
                String sexPatient = scanner.nextLine();
                System.out.println("BSN:");
                String bsn = scanner.nextLine();
                System.out.println("Benodigd specialisme:");
                String specialty = scanner.nextLine();
                System.out.println("");

                patients.add(new Patient(namePatient, birthDate, sexPatient, bsn, specialty));
            } else if (chosen == 4) {
                System.out.println("Naam patiënt:");
                String namePatient = scanner.nextLine();

                for (Patient patient : patients) {
                    if (patient.getNamePatient().equals(namePatient)) {
                        System.out.println(patient);
                    }
                }

                for (Patient patient : patients) {
                    for (Research research : researches) {
                        if (patient.getSpecialty().equals(research.getSpecialty())
                                && patient.getNamePatient().equals(namePatient)) {
                            System.out.println(research);
                            show = true;
                        }
                    }
                }

                if (show == true) {
                    for (Patient patient : patients) {
                        for (Doctor doctor : doctors) {
                            if (patient.getSpecialty().equals(doctor.getSpecialty())
                                    && patient.getNamePatient().equals(namePatient)) {
                                System.out.println(doctor);
                            }
                        }
                    }
                }
                System.out.println("");
                show = false;
            }
        }
    }
}
