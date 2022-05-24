public class Research {
    private String nameResearch;
    private String result;
    private String specialty;

    public Research(String nameResearch, String result, String specialty) {
        this.nameResearch = nameResearch;
        this.result = result;
        this.specialty = specialty;
    }

    public String getNameResearch() {
        return this.nameResearch;
    }

    public String getResult() {
        return this.result;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public String toString() {
        return "Naam onderzoek: " + this.nameResearch + ", Uitslag: " + this.result + ", Specialisme: "
                + this.specialty;
    }
}
