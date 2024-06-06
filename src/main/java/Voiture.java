package java.romain;

public class Voiture {
    public String marque;
    public int prix;


    public Voiture(String marque,int prix){
        this.marque= marque;
        this.prix = prix;
    }
    public Voiture(){}


    public String getMarque() {
        return this.marque;
    }

    public int getPrix() {
        return this.prix;
    }
    public void setMarque(String marque){
        this.marque = marque;
    }
    public void setPrix(int prix){
        this.prix = prix;
    }
    public String toString() {
        return "Je suis une Voiture " + marque + " et je coûte " + prix;
    }




}