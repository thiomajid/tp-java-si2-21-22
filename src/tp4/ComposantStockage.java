package tp4;

import tp3.Article;

public class ComposantStockage extends Article implements Garantissable {
    private int capacite;

    public ComposantStockage(String nom, double prix, int capacite) {
        super(nom, prix);
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }


    @Override
    public String toString() {
        return super.toString() + ", Capacite <" + capacite + ">, Garantie <" + this.garantirAppareil() + " an(s)>";
    }

    @Override
    public int garantirAppareil() {
        if (this.capacite <= 500)
            return 1;
        else
            return 2;
    }
}
