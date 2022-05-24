public class Doctor {
    private String nameDoctor;
    private String specialty;

    public Doctor(String nameDoctor, String specialty) {
        this.nameDoctor = nameDoctor;
        this.specialty = specialty;
    }

    public String getNameDoctor() {
        return this.nameDoctor;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public String toString() {
        return "Naam arts: " + this.nameDoctor + ", Specialisme: " + this.specialty;
    }
}
