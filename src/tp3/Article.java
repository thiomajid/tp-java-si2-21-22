package tp3;

public class Article {
    private static int id;

    static {
        id = 0;
    }

    private final int idProduit;
    private String nom;
    private String reference;
    private double prix;

    public Article(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
        this.idProduit = id++;
        this.reference = genererReference();
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Modification|création de la reference et du nom du produit
    private String genererReference() {
        String reference = "";
        for (int i = 0; i < nom.length(); i++) {
            if (i % 5 == 0) {
                if (nom.charAt(i) == ' ')
                    continue;
                else
                    reference += nom.charAt(i);
            }
        }
        reference += idProduit;
        return reference.toString().trim();
    }

    public void modifier(String nom) {
        this.nom = nom;
        this.reference = genererReference();
    }

    public void modifier(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
        this.reference = this.genererReference();
    }

    @Override
    public String toString() {
        return "id = <" + this.idProduit + ">, nom = <" + this.nom + ">, reference = <" + this.reference + ">, prix = <"
                + this.prix + ">";
    }

}