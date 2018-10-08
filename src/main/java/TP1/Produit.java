package TP1;

public class Produit {
    int codeProduit ;
    String denomination ;
    double prix ;

    public Produit(int codeProduit, String denomination, double prix) {
        this.codeProduit = codeProduit;
        this.denomination = denomination;
        this.prix = prix;
    }

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "codeProduit=" + codeProduit +
                ", denomination='" + denomination + '\'' +
                ", prix=" + prix +
                '}';
    }
}
