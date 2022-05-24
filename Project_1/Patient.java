public class Patient {
    private String namePatient;
    private String birthDate;
    private String sexPatient;
    private String bsn;
    private String specialty;

    public Patient(String namePatient, String birthDate, String sexPatient, String bsn, String specialty) {
        this.namePatient = namePatient;
        this.birthDate = birthDate;
        this.sexPatient = sexPatient;
        this.bsn = bsn;
        this.specialty = specialty;
    }

    public String getNamePatient() {
        return this.namePatient;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getSexPatient() {
        return this.sexPatient;
    }

    public String getBsn() {
        return this.bsn;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public String toString() {
        return "Naam patiënt: " + this.namePatient + ", Geboortedatum: " + this.birthDate + ", Geslacht: "
                + this.sexPatient + ", BSN: " + this.bsn;
    }
}
