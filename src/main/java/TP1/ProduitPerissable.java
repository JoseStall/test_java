package TP1;

public class ProduitPerissable extends Produit {
    double dureeConservation ;
    double dateFabrication ;

    public ProduitPerissable(int codeProduit, String denomination, double prix, double dureeConservation, double dateFabrication) {
        super(codeProduit, denomination, prix);
        this.dureeConservation = dureeConservation;
        this.dateFabrication = dateFabrication;
    }

    public double getDureeConservation() {
        return dureeConservation;
    }

    public void setDureeConservation(double dureeConservation) {
        this.dureeConservation = dureeConservation;
    }

    public double getDateFabrication() {
        return dateFabrication;
    }

    public void setDateFabrication(double dateFabrication) {
        this.dateFabrication = dateFabrication;
    }

    @Override
    public String toString() {
        return "ProduitPerissable{" +
                "dureeConservation=" + dureeConservation +
                ", dateFabrication=" + dateFabrication +
                ", codeProduit=" + codeProduit +
                ", denomination='" + denomination + '\'' +
                ", prix=" + prix +
                '}';
    }
}
