package tp4;

public class OrdinateurDeBureau extends Ordinateur {
    private String alimentation;

    public OrdinateurDeBureau(String nom, double prix, double resolutionEcran, String processeur, long ram,
                              SystemeExploitation systemeExploitation, long disqueDur, String carteGraphique,
                              String alimentation) {
        super(nom, prix, resolutionEcran, processeur, ram, systemeExploitation, disqueDur, carteGraphique);
        this.alimentation = alimentation;
    }


    public String getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }

    @Override
    public int garantirAppareil() {
        return 1;
    }

    @Override
    public String toString() {
        return "Ordinateur de bureau [ " + super.toString() + ", Alimentation <" + alimentation + ">, Garantie <" +
                this.garantirAppareil() + " an(s) > ]";
    }
}
