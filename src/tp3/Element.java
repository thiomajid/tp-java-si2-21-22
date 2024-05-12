package tp3;

public class Element {

    private Article article;
    private long quantity;

    public Element(Article something, long qte) {
        this.article = something;
        this.quantity = qte;
    }

    public Element(String nom, double prix, long quantity) {
        this(new Article(nom, prix), quantity);
    }

    public Article getArticle() {
        return this.article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getNomArticle() {
        return this.article.getNom();
    }

    public double getPrixArticle() {
        return this.article.getPrix();
    }

    public String getReferenceArticle() {
        return this.article.getReference();
    }

    public void incrementerQuantite(long quantity) {
        this.quantity += quantity;
    }

    public void decrementerQuantite(long quantity) {
        this.quantity -= quantity;
    }

    public void modifier(String nom, double prix, long quantity) {
        this.quantity = quantity;
        this.article.modifier(nom, prix);
    }

    public boolean equals(Object something) {
        return ((this.quantity==((Element)something).quantity) && (this.article.equals(((Element)something).article)));
    }

    public boolean equals(String something) {
        return (this.article.getReference().equals(something));
    }

    @Override
    public String toString() {
        return "[article = " + this.article.toString() + ", quantité = <" + this.quantity + ">]";
    }

}