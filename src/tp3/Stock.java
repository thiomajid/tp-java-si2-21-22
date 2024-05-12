package tp3;

import tp4.*;

import java.util.ArrayList;

public class Stock {

    private ArrayList<Element> articleList;

    public Stock() {
        this.articleList = new ArrayList<Element>();
    }

    public Stock(ArrayList<Element> list) {
        this.articleList = list;
    }

    public Stock(ArrayList<String> nameList, ArrayList<Double> priceList, ArrayList<Long> quantityList) {
        this();
        for (int i = 0; i < nameList.size(); i++)
            articleList.add(new Element(new Article(nameList.get(i), priceList.get(i)), quantityList.get(i)));

    }

    public ArrayList<Element> getArticleList() {
        return this.articleList;
    }

    public void setArticleList(ArrayList<Element> something) {
        this.articleList = something;
    }

    public int getArticleNb() {
        return this.articleList.size();
    }

    public void ajouterArticle(Article something, long quantity) {
        this.articleList.add(new Element(something, quantity));
    }

    public void ajouterArticle(String nom, double prix, long quantity) {
        this.articleList.add(new Element(new Article(nom, prix), quantity));
    }

    /***
     * Pour l'ajout d'un ordinateur de bureau
     * @param nom
     * @param prix
     * @param resolutionEcran
     * @param processeur
     * @param ram
     * @param systemeExploitation
     * @param disqueDur
     * @param carteGraphique
     * @param alimentation
     */
    public void ajouterArticle(String nom, double prix, double resolutionEcran, String processeur, long ram,
                               SystemeExploitation systemeExploitation, long disqueDur, String carteGraphique,
                               String alimentation) {

        Article ordinateur = new OrdinateurDeBureau(nom, prix, resolutionEcran, processeur, ram, systemeExploitation,
                disqueDur, carteGraphique, alimentation);

        this.articleList.add(new Element(ordinateur, 0));
    }

    /***
     * Pour l'ajout d'un ordinateur portable au stock
     * @param nom
     * @param prix
     * @param resolutionEcran
     * @param processeur
     * @param ram
     * @param systemeExploitation
     * @param disqueDur
     * @param carteGraphique
     * @param capaciteBatterie
     */
    public void ajouterArticle(String nom, double prix, double resolutionEcran, String processeur, long ram,
                               SystemeExploitation systemeExploitation, long disqueDur, String carteGraphique,
                               long capaciteBatterie) {

        Article ordinateur = new OrdinateurPortable(nom, prix, resolutionEcran, processeur, ram, systemeExploitation,
                disqueDur, carteGraphique, capaciteBatterie);

        this.articleList.add(new Element(ordinateur, 0));
    }

    /***
     * Pour l'ajout d'un appareil mobile au stock
     * @param nom
     * @param prix
     * @param resolutionEcran
     * @param processeur
     * @param ram
     * @param systemeExploitation
     * @param appareilPhotoArriere
     * @param appareilPhotoFrontal
     * @param nbSim
     * @param capaciteBatterie
     */
    public void ajouterArticle(String nom, double prix, double resolutionEcran, String processeur, long ram,
                               SystemeExploitation systemeExploitation, double appareilPhotoArriere, double appareilPhotoFrontal,
                               int nbSim, long capaciteBatterie) {

        Article mobile = new Mobile(nom, prix, resolutionEcran, processeur, ram, systemeExploitation, appareilPhotoArriere,
                appareilPhotoFrontal, nbSim, capaciteBatterie);

        this.articleList.add(new Element(mobile, 0));
    }

    /***
     * Pour l'ajout d'un composant de stockage au stock
     * @param nom
     * @param prix
     * @param capacite
     */
    public void ajouterArticle(String nom, double prix, int capacite) {
        Article composant = new ComposantStockage(nom, prix, capacite);
        this.articleList.add(new Element(composant, 0));
    }

    /***
     * Pour l'ajout d'un périphérique au stock
     * @param nom
     * @param prix
     * @param technologieDeConnexion
     * @param interfaceAvecOrdinateur
     */
    public void ajouterArticle(String nom, double prix, String technologieDeConnexion, String interfaceAvecOrdinateur) {

        Article peripherique = new Peripherique(nom, prix, technologieDeConnexion, interfaceAvecOrdinateur);
        this.articleList.add(new Element(peripherique, 0));
    }

    /***
     * Retourne l'article dont la référence est passée en paramètre
     * @param ref
     * @return copy
     */
    public Element trouverArticle(String ref) {
        Element copy = null;
        for (Element something : this.articleList) {
            if (something.getReferenceArticle().equals(ref)) {
                copy = something;
                break;
            }
        }

        return copy;
    }

    public void modifierArticle(String reference, String nom, double prix, long quantity) {
        this.trouverArticle(reference).modifier(nom, prix, quantity);
    }

    public void supprimerArticle(String reference) {
        this.articleList.remove(this.trouverArticle(reference));
    }

    public void incrementerQuantite(String reference, long quantity) {
        this.trouverArticle(reference).incrementerQuantite(quantity);
    }

    public void decrementerQuantite(String reference, long quantity) {
        this.trouverArticle(reference).decrementerQuantite(quantity);
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();

        for (Element element : this.articleList)
            description.append(element.toString()).append("\n");

        return description.toString();
    }

}