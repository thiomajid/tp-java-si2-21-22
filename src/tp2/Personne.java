package tp2;

public class Personne {

    private String cin;
    private String nom;
    private String prenom;
    private Adresse adresse;

    public Personne(String cin, String nom, String prenom, Adresse adresse) {
        this.adresse = adresse;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String cin, String nom, String prenom, String gouvernorat, int codePostal) {
        this(cin, nom, prenom, new Adresse(gouvernorat, codePostal));
        this.adresse
    }

    public String getCin() {
        return this.cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "CIN = " + this.cin + ", nom = " + this.nom + ", prenom = " + this.prenom + ", Adresse [ "
                + this.adresse.toString() + " ]";
    }
}