package tp4;

import tp3.Article;

public class Peripherique extends Article {
    private String technologieDeConnexion;
    private String interfaceAvecOrdinateur;

    public Peripherique(String nom, double prix, String technologieDeConnexion, String interfaceAvecOrdinateur) {
        super(nom, prix);
        this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
        this.technologieDeConnexion = technologieDeConnexion;
    }

    public String getInterfaceAvecOrdinateur() {
        return interfaceAvecOrdinateur;
    }

    public void setInterfaceAvecOrdinateur(String interfaceAvecOrdinateur) {
        this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
    }

    public String getTechnologieDeConnexion() {
        return technologieDeConnexion;
    }

    public void setTechnologieDeConnexion(String technologieDeConnexion) {
        this.technologieDeConnexion = technologieDeConnexion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Technologie de connexion <" + technologieDeConnexion + ">, Interface avec" +
                "ordinateur <" + interfaceAvecOrdinateur + ">";
    }
}
