package tp2;

public class Adresse {

    private String gouvernorat;
    private int codePostal;

    private static int nombreAdresse = 0;

    public Adresse(String gouvernorat, int codePostal) {
        nombreAdresse++;
        this.codePostal = codePostal;
        this.gouvernorat = gouvernorat;
    }

    public String getGouvernorat() {
        return this.gouvernorat;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public int getCodePostal() {
        return this.codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }


    @Override
    public String toString() {
        return "Gouvernorat = " + this.gouvernorat + ", code postal = " + this.codePostal;
    }
}