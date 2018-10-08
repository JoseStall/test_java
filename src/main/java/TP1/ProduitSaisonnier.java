package TP1;

public class ProduitSaisonnier extends Produit {
    String saison ;
    double remiseFinDeSaison ;

    public ProduitSaisonnier(int codeProduit, String denomination, double prix, String saison, double remiseFinDeSaison) {
        super(codeProduit, denomination, prix);
        this.saison = saison;
        this.remiseFinDeSaison = remiseFinDeSaison;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public double getRemiseFinDeSaison() {
        return remiseFinDeSaison;
    }

    public void setRemiseFinDeSaison(double remiseFinDeSaison) {
        this.remiseFinDeSaison = remiseFinDeSaison;
    }

    @Override
    public String toString() {
        return "ProduitSaisonnier{" +
                "saison='" + saison + '\'' +
                ", remiseFinDeSaison=" + remiseFinDeSaison +
                ", codeProduit=" + codeProduit +
                ", denomination='" + denomination + '\'' +
                ", prix=" + prix +
                '}';
    }
}
