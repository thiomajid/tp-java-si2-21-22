package tp4;

public class Mobile extends AppareilInformatique {
    private double appareilPhotoArriere;
    private double appareilPhotoFrontal;
    private int nbSim;
    private long capaciteBatterie;

    public Mobile(String nom, double prix, double resolutionEcran, String processeur, long ram,
                  SystemeExploitation systemeExploitation, double appareilPhotoArriere, double appareilPhotoFrontal,
                  int nbSim, long capaciteBatterie) {
        super(nom, prix, resolutionEcran, processeur, ram, systemeExploitation);
        this.appareilPhotoFrontal = appareilPhotoFrontal;
        this.appareilPhotoArriere = appareilPhotoArriere;
        this.nbSim = nbSim;
        this.capaciteBatterie = capaciteBatterie;
    }


    public double getAppareilPhotoArriere() {
        return appareilPhotoArriere;
    }

    public void setAppareilPhotoArriere(double appareilPhotoArriere) {
        this.appareilPhotoArriere = appareilPhotoArriere;
    }

    public double getAppareilPhotoFrontal() {
        return appareilPhotoFrontal;
    }

    public void setAppareilPhotoFrontal(double appareilPhotoFrontal) {
        this.appareilPhotoFrontal = appareilPhotoFrontal;
    }

    public int getNbSim() {
        return nbSim;
    }

    public void setNbSim(int nbSim) {
        this.nbSim = nbSim;
    }

    public long getCapaciteBatterie() {
        return capaciteBatterie;
    }

    public void setCapaciteBatterie(long capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }

    @Override
    public int garantirAppareil() {
        if (this.getPrix() > 1000)
            return 2;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Mobile [ " + super.toString() + ", Camera arriere <" + appareilPhotoArriere + "px>," +
                "Camera frontale <" + appareilPhotoFrontal + "px>, Nombre de sims <" + nbSim + ">, Batterie <"
                + capaciteBatterie + "amh>, Garantie <" + this.garantirAppareil() + "an(s)> ]";
    }
}
